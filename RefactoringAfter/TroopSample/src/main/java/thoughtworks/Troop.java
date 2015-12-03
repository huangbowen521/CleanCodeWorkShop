package thoughtworks;

public class Troop {

    String number;
    private MemberList members;

    public Troop(String troopNumber) {
        this.number = troopNumber;
        members = new MemberList();
    }

    public void addScout(String name, int position, int rank) {
        members.addBoyScout(name,position,rank);
    }

    public void addAdult(String name, int position) {
        members.addAdult(name,position);
    }

    public String scoutsAdultsReport() {
        return members.scoutsAdultsReport(number);
    }

    public String allReport() {
        return members.getAllReports(number);
    }


}
