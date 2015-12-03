package thoughtworks.entity;

import thoughtworks.Position;
import thoughtworks.Rank;
import thoughtworks.entity.Member;

public class BoyScout extends Member {

    private int rank;

    public BoyScout(String name, int position, int rank) {
        super(name, position);
        this.rank = rank;
    }

    @Override
	public String toString() {

		return String.format("%s - Boyscout, Position = %s, Rank = %s",getName(),scoutPositionString(),scoutRankString());
	}

	private String scoutPositionString() {
		return Position.getDescriptionBy(getPosition());
	}

	private String scoutRankString() {
		return Rank.getDescriptionBy(rank);
	}

}
