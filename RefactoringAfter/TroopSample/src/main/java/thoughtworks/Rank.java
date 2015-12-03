package thoughtworks;

public enum Rank {
    SCOUT(0, "Scout"),
    TENDERFOOT(1, "Tenderfoot"),
    SECOND_CLASS(2, "Second Class"),
    FIRST_CLASS(3, "First Class"),
    STAR(4, "Star"),
    LIFE(5, "Life"),
    EAGLE(6, "Eagle");

    public int getIndex() {
        return index;
    }

    private final int index;
    private final String description;

    Rank(int index, String description) {
        this.index = index;
        this.description = description;
    }

    public static String getDescriptionBy(int index) {
        for (Rank rank : Rank.values()) {
            if (index == rank.index) {
                return rank.description;
            }
        }

        return null;
    }
}
