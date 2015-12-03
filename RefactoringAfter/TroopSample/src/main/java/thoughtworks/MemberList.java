package thoughtworks;

import thoughtworks.entity.Adult;
import thoughtworks.entity.BoyScout;
import thoughtworks.entity.Member;

import java.util.ArrayList;
import java.util.Collections;

public class MemberList {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final String LINEPREFIX = "  ";
    ArrayList<Member> members = new ArrayList<Member>();

    public void addAdult(String name, int postion) {
        members.add(new Adult(name,postion));
    }

    public void addBoyScout(String name, int position, int rank) {
        members.add(new BoyScout(name,position,rank));
    }


    public String getAllReports(String number) {
        String result = "All members of Troop " + number + NEWLINE;
        Collections.sort(members);
        for (Member member : members) {
            result += "  " + member.toString();
            result += NEWLINE;
        }
        return result;

    }


    public String scoutsAdultsReport(String number) {
        Collections.sort(members);
        String result = "Adult members of Troop " + number + NEWLINE;
        result += getReportCollection(Adult.class);

        result += "Scout members of Troop " + number + NEWLINE;
        result += getReportCollection(BoyScout.class);
        return result;
    }

    private String getReportCollection(Class clazz) {
        String result = "";
        for (Member member : members) {
            if (clazz.isInstance(member)) {
                result += LINEPREFIX + member.toString();
                result += NEWLINE;
            }
        }
        return result;
    }


}
