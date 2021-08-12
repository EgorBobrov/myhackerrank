package puzzles.sortingandsearching;

abstract class VersionControl {

    private final int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    boolean isBadVersion(int version) {
        return badVersion == version;
    }
}
