package thoughtworks;
import junit.framework.TestCase;
import static thoughtworks.TroopConstants.*;

public class TestTroop extends TestCase {
	private troop troop;
	
	public void testAllReport() {
		this.troop = new troop("513");
		troop.addAdult("Jim Johnson", COMMITTEE_MEMBER);
		troop.addAdult("Tom Tucker", ASST_SCOUTMASTER);
		troop.addScout("Nick Knack",SPL, STAR);
		troop.addScout("Kit Karson", ASPL, EAGLE);
		troop.addScout("Ace Knotsman", HISTORIAN,LIFE);
		System.out.println(troop.allReport());
		assertEquals("All members of Troop 513" + NEWLINE +
			"  Ace Knotsman - Boyscout, Position = Historian, Rank = Life" + NEWLINE +
				"  Jim Johnson - Adult, Position = Committee Member" + NEWLINE +
				"  Kit Karson - Boyscout, Position = Assistant Senior Patrol Leader, Rank = Eagle" + NEWLINE +
				"  Nick Knack - Boyscout, Position = Senior Patrol Leader, Rank = Star" + NEWLINE +
				"  Tom Tucker - Adult, Position = Assistant Scoutmaster" + NEWLINE,
						troop.allReport());
	
	}
	public void testScoutsAdultsReport() {
		this.troop = new troop("513");
		troop.addAdult("Jim Johnson", COMMITTEE_MEMBER);
		troop.addAdult("Tom Tucker", ASST_SCOUTMASTER);
		troop.addScout("Nick Knack",SPL, STAR);
		troop.addScout("Kit Karson", ASPL, EAGLE);
		troop.addScout("Ace Knotsman", HISTORIAN,LIFE);
 		assertEquals("Adult members of Troop 513" + NEWLINE +
 				"  Jim Johnson - Adult, Position = Committee Member" + NEWLINE +
		        "  Tom Tucker - Adult, Position = Assistant Scoutmaster" + NEWLINE +
				"Scout members of Troop 513" + NEWLINE +
				"  Ace Knotsman - Boyscout, Position = Historian, Rank = Life" + NEWLINE +
				"  Kit Karson - Boyscout, Position = Assistant Senior Patrol Leader, Rank = Eagle" + NEWLINE +
				"  Nick Knack - Boyscout, Position = Senior Patrol Leader, Rank = Star" + NEWLINE,
						troop.scoutsAdultsReport());
		System.out.println(troop.scoutsAdultsReport());
	}
}
