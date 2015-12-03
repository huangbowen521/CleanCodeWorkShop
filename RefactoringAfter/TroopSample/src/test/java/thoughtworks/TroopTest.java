package thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TroopTest {
	private Troop troop;

    @Before
    public void setUp() {

        initTroop();
    }

    private void initTroop() {
		this.troop = new Troop("513");
		troop.addAdult("Jim Johnson", Position.COMMITTEE_MEMBER.getIndex());
		troop.addAdult("Tom Tucker", Position.ASST_SCOUTMASTER.getIndex());
		troop.addScout("Nick Knack", Position.SENIOR_PATROL_LEADER.getIndex(), Rank.STAR.getIndex());
		troop.addScout("Kit Karson", Position.ASSISTANT_SENIOR_PATROL_LEADER.getIndex(), Rank.EAGLE.getIndex());
		troop.addScout("Ace Knotsman", Position.HISTORIAN.getIndex(), Rank.LIFE.getIndex());
	}

	@Test
	public void testAllReport() {
		Assert.assertEquals("All members of Troop 513" + System.getProperty("line.separator") +
						"  Ace Knotsman - Boyscout, Position = Historian, Rank = Life" + System.getProperty("line.separator") +
						"  Jim Johnson - Adult, Position = Committee Member" + System.getProperty("line.separator") +
						"  Kit Karson - Boyscout, Position = Assistant Senior Patrol Leader, Rank = Eagle" + System.getProperty("line.separator") +
						"  Nick Knack - Boyscout, Position = Senior Patrol Leader, Rank = Star" + System.getProperty("line.separator") +
						"  Tom Tucker - Adult, Position = Assistant Scoutmaster" + System.getProperty("line.separator"),
				troop.allReport());

	}


	@Test
	public void testScoutsAdultsReport() {
 		Assert.assertEquals("Adult members of Troop 513" + System.getProperty("line.separator") +
						"  Jim Johnson - Adult, Position = Committee Member" + System.getProperty("line.separator") +
						"  Tom Tucker - Adult, Position = Assistant Scoutmaster" + System.getProperty("line.separator") +
						"Scout members of Troop 513" + System.getProperty("line.separator") +
						"  Ace Knotsman - Boyscout, Position = Historian, Rank = Life" + System.getProperty("line.separator") +
						"  Kit Karson - Boyscout, Position = Assistant Senior Patrol Leader, Rank = Eagle" + System.getProperty("line.separator") +
						"  Nick Knack - Boyscout, Position = Senior Patrol Leader, Rank = Star" + System.getProperty("line.separator"),
				troop.scoutsAdultsReport());
		System.out.println(troop.scoutsAdultsReport());
	}
}
