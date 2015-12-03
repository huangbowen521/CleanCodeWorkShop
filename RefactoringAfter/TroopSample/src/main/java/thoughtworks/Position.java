package thoughtworks;

public enum Position {
    COMMITTEE_MEMBER(0, "Committee Member"),
    SCOUTMASTER(1, "Scoutmaster"),
    COMMITTEE_CHAIR(2, "Committee Chair"),
    ASST_SCOUTMASTER(3, "Assistant Scoutmaster"),
    SENIOR_PATROL_LEADER(10, "Senior Patrol Leader"),
    ASSISTANT_SENIOR_PATROL_LEADER(11, "Assistant Senior Patrol Leader"),
    HISTORIAN(12, "Historian"),
    LIBRARIAN(13, "Librarian"),
    SCRIBE(14, "Scribe"),
    BUGLER(15, "Bugler"),
    NONE(16, "None");

    public int getIndex() {
        return index;
    }

    private final int index;
    private final String description;

    Position(int index, String description) {
        this.index = index;
        this.description = description;
    }

    public static String getDescriptionBy(int index) {

        for (Position adultPosition : values()) {
            if (index == adultPosition.index) {
                return adultPosition.description;
            }
        }

        return null;
    }
}
