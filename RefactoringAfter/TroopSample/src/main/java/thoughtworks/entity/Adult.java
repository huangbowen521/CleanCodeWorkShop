package thoughtworks.entity;

import thoughtworks.Position;

public class Adult extends Member {

	public Adult(String name, int position) {
		super(name, position);
	}

    @Override
    public String toString() {
        String result = String.format("%s - Adult, Position = %s", getName(), Position.getDescriptionBy(getPosition()));
        return result;
    }

}
