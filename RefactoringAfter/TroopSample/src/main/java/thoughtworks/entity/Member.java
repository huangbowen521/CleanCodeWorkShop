package thoughtworks.entity;


public abstract class Member implements Comparable<Member> {

    private String name;
    private int position;

    public Member(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    //@Override
    public int compareTo(Member that) {
        return this.getName().compareTo(that.getName());
    }
}
