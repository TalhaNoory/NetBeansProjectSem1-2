package teamwork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataAccessObject_impl {

    private DBConnector connector = null;

    DataAccessObject_impl(DBConnector connector) {
        this.connector = connector;
    }

    public ArrayList<User> getTeamMembers(int team_id) throws SQLException {

        ArrayList allTeamMembers = new ArrayList();
        String query = "select * from `user` natural join `team_member` where team_id = '" + team_id + "';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);

        while (rs.next()) {
            User user = new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getBoolean("admin"));
            allTeamMembers.add(user);
        }
        return allTeamMembers;

    }

    public ArrayList<Team> getTeams() throws SQLException {
        ArrayList allTeams = new ArrayList();
        String query = "select * from team;";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        while (rs.next()) {
            Team team = new Team(rs.getInt("team_id"), rs.getString("teamname"), getTeamMembers(rs.getInt("team_id")));
            allTeams.add(team);
        }
        return allTeams;
    }

    public Team getTeam(int id) throws SQLException {
        String query = "select * from team where team_id = '" + id + "';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        //jeg tjekker først om der er noget data om det valgte team
        //hvis der ikke er noget laver jeg et team der er null og returner det
        if (rs.first() == false) {
            Team team = null;
            return team;
        } else {
            Team team = new Team(rs.getInt("team_id"), rs.getString("teamname"), getTeamMembers(rs.getInt("team_id")));
            return team;
        }
    }

    public Team getTeam(String teamname) throws SQLException {
        String query = "select * from team where teamname = '" + teamname + "';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        //jeg tjekker først om der er noget data om det valgte team
        //hvis der ikke er noget laver jeg et team der er null og returner det
        if (rs.first() == false) {
            Team team = null;
            return team;
        } else {
            Team team = new Team(rs.getInt("team_id"), rs.getString("teamname"), getTeamMembers(rs.getInt("team_id")));
            return team;
        }
    }

    public ArrayList<User> getUsers() throws SQLException {
        ArrayList allUsers = new ArrayList();
        String query = "select * from `user`;";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);

        while (rs.next()) {
            User user = new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getBoolean("admin"));
            allUsers.add(user);
        }
        return allUsers;
    }

    public User getUser(int id) throws SQLException {
        String query = "select * from `user` where user_id = '" + id + "';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        rs.next();
        User user = new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getBoolean("admin"));
        return user;
    }

    public User getUser(String username) throws SQLException {
        String query = "select * from `user` where username = '" + username + "';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        rs.next();
        User user = new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"), rs.getBoolean("admin"));
        return user;
    }

}
