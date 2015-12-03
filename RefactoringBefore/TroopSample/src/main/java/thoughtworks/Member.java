package thoughtworks;

public class Member implements Comparable<Member> {
	
	public static Member createMember(String name, int position, int type,
			int rank) {
		return new Member(name, position, type, rank);
	}

	private int type;
	private String name;
	private int position;
	private int rank;
	
	private Member(String name,int position,int type, int rank) {
		this.type = type;
		this.name = name;
		this.position = position;
		this.rank = rank;
	}
	
	public Member(String name,int position,int type) {
		this.type = type;
		this.name = name;
		this.position = position;
		this.rank = 0;
	}
	public String getName() {
		return this.name;
	}
	public int getPosition() {
		return this.position;
	}
	public int getRank() {
		return this.rank;
	}
	public int getType() {
		return this.type;
	}
	
	//@Override
	public int compareTo(Member that) {
		return this.getName().compareTo(that.getName());
	}

}
