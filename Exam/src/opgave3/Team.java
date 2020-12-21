package opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private ArrayList<TeamMember> members = new ArrayList<>();

    //a
    public void addTeamMember(TeamMember m) {

        members.add(m);

    }

    // Nothing to do here!
    public ArrayList<TeamMember> getAllMembers() {
        return members;
    }

    //b
    public boolean removeTeamMember(TeamMember m) {

        if (members.contains(m)) {
            members.remove(m);
            return true;

        }
        return false;

    }

//c
    public int getNextId() {
        throw new UnsupportedOperationException();

    }
    
    //d
    public ArrayList<TeamMember> retriveMembersByRole(String role) {
//        throw new UnsupportedOperationException();

        for (int i = 0; i < members.size(); i++) {
            if (role.length() == i) return ;
        }

    }

    //e
    public void sortByNameAsc(ArrayList<TeamMember> members) {
        throw new UnsupportedOperationException();
    }

    //f
    public void sortByRoleDesc(ArrayList<TeamMember> members) {
        throw new UnsupportedOperationException();
    }

}
