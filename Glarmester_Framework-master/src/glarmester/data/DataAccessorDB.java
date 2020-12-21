/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glarmester.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author frede
 */
public class DataAccessorDB implements DataAccessor {
    DBConnector connector = null;

    public DataAccessorDB(DBConnector connector) {
        this.connector = connector;
    }

    @Override
    public List<Frame> getFrames() throws DataException {
        ArrayList allFrames = new ArrayList();
        try {
        String query = "select * from frames;";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        while (rs.next()) {
            Frame frame = new Frame(rs.getString("frame_name"), rs.getDouble("frame_price"));
            allFrames.add(frame);
        }
        }
        catch (SQLException ex){
            throw new DataException(ex);
        }
        return allFrames;
    }

    @Override
    public Frame getFrame(String name) throws DataException {
         try {
        String query = "select * from frames where frame_name = '" + name + "';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        rs.next();
            Frame frame = new Frame(rs.getString("frame_name"), rs.getDouble("frame_price"));        
        return frame;
        }
        catch (SQLException ex){
            throw new DataException(ex);
        }
    }

    @Override
    public double getGlassPrice() throws DataException {
        try {
        String query = "select glass_price from glass where glass_type = 'Glass';";
        Connection connection = connector.getConnection();
        ResultSet rs = connection.createStatement().executeQuery(query);
        rs.next();               
        return rs.getDouble("glass_price");
        }
        catch (SQLException ex){
            throw new DataException(ex);
        }
    }
    
}
