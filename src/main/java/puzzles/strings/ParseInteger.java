package puzzles.strings;
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
// Implement a function which converts a string to a 32-bit signed integer.
/*
The algorithm for myAtoi(string s) is as follows:
1. Read in and ignore any leading whitespace.
2. Check if the next character (if not already at the end of the string) is '-' or '+'.
Read this character in if it is either.
This determines if the final result is negative or positive respectively.
Assume the result is positive if neither is present.
3. Read in next the characters until the next non-digit charcter or the end of the input is reached.
The rest of the string is ignored.
4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32).
If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
5. If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1],
then clamp the integer so that it remains in the range.
Specifically, integers less than -2^31 should be clamped to -2^31,
and integers greater than 2^31 - 1 should be clamped to 2^31 - 1.
6. Return the integer as the final result.
 */
public class ParseInteger {
    public static int myAtoi(String s) {
        if (s.length() == 0) return 0;
        // Skip the whitespace and return the position of the first non-whitespace char (or end of the string)
        int position = skipWhitespace(s);
        if (position >= s.length()) return 0;
        // check if the next char is - or + and move to the next, or if neither, just stay at this one
        boolean isPositive = true;
        if (s.charAt(position) == '-') {
            isPositive = false;
            position++;
        } else if (s.charAt(position) == '+') {
            position++;
        }
        // check if we have something other than numbers at current position and return 0 in that case
        if (position >= s.length() || s.charAt(position) < '0' || s.charAt(position) > '9') return 0;
        // now we know that we have a number, so let's start reading it
        // converting char to int by subtracting '0'
        int result = s.charAt(position++) - '0';
        if (!isPositive) result *= -1;
        // we get the most significant digit. For each new digit, we multiply the existing number
        // by 10 and add the new one. We keep safe from over/underflow by using library functions.
        while (position < s.length() &&
                s.charAt(position) >= '0' && s.charAt(position) <= '9') {
            try {
                result = Math.multiplyExact(result, 10);
                if (isPositive) {
                    result = Math.addExact(result, s.charAt(position) - '0');
                } else {
                    result = Math.subtractExact(result, s.charAt(position) - '0');
                }
                position++;
            } catch (ArithmeticException e) {
                return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return result;
    }

    private static int skipWhitespace(String s) {
        int position = 0;
        while (position < s.length() && s.charAt(position) == ' ') {
            position++;
        }
        return position;
    }
}
