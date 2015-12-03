package thoughtworks;

public class TroopConstants {
	public static final String 
		NEWLINE = System.getProperty("line.separator");
//  Adult Positions
	public static final int ADULT = 1;
	public static final int BOYSCOUT = 0;
	public static final int LOWEST_ADULT_POSITION = 0;
	public static final int COMMITTEE_MEMBER = 0;
	public static final int SCOUTMASTER = 1;
	public static final int COMMITTEE_CHAIR = 2;
	public static final int ASST_SCOUTMASTER = 3;
	public static final String STRING_ADULT_POSITION[] = {
		"Committee Member",
		"Scoutmaster",
		"Committee Chair",
		"Assistant Scoutmaster"
	};
	public static final int HIGHEST_ADULT_POSITION = 3;
	// Scout Positions
	public static final int LOWEST_SCOUT_POSITION = 10;
	public static final int SPL = 10;
	public static final int ASPL = 11;
	public static final int HISTORIAN = 12;
	public static final int LIBRARIAN = 13;
	public static final int SCRIBE = 14;
	public static final int BUGLER = 15;
	public static final int NO_LEADERSHIP = 16;
	public static final int HIGHEST_SCOUT_POSITION = 16;
	public static final String STRING_SCOUT_POSITION[] = {
		"Senior Patrol Leader",
		"Assistant Senior Patrol Leader",
		"Historian",
		"Librarian",
		"Scribe",
		"Bugler",
		"None"
	};

	// Scout ranks
	public static final int LOWEST_SCOUT_RANK = 0;
	public static final int SCOUT = 0;
	public static final int TENDERFOOT = 1;
	public static final int SECOND_CLASS = 2;
	public static final int FIRST_CLASS = 3;
	public static final int STAR = 4;
	public static final int LIFE = 5;
	public static final int EAGLE = 6;
	public static final int HIGHEST_SCOUT_RANK = 6;
	public static final String STRING_SCOUT_RANK[] = {
		"Scout",
		"Tenderfoot",
		"Second Class",
		"First Class",
		"Star",
		"Life",
		"Eagle"
	};
}
