/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller.blood_stock_management;

import connection.DBConnection;
import connection.DBHandler;
import controller.common.RecordCounter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BloodType; 
 
/**
 *
 * @author Anuradha
 */
public class BloodTypeController {
    
    public String[] getComponentList() throws SQLException, ClassNotFoundException {
        ResultSet rst;
        String query = "Select BloodType From bloodtype order by BloodType";
        Connection connection = DBConnection.getConnectionToDB();
        rst =  DBHandler.getData(connection, query);
        int count = RecordCounter.getRecordCount(rst);
        String[] comps = new String[count];
        for (int i = 0; rst.next(); i++) {
            comps[i] = rst.getString(1);
        }
        return comps;
    }

    public static int addType(BloodType type) throws ClassNotFoundException, SQLException {
        String query = "Insert into BloodType(BloodType) values ('" +type.getBloodType() + "')";
        Connection connection = DBConnection.getConnectionToDB();
        int res = DBHandler.setData(connection, query);
        return res;
    }

    public static int updateType(BloodType oldType, BloodType newType) throws ClassNotFoundException, SQLException {
        String query = "update BloodType set BloodType='" + newType.getBloodType() + "' where BloodType='" + oldType.getBloodType() + "'";
        Connection connection = DBConnection.getConnectionToDB();
        int res = DBHandler.setData(connection, query);
        return res;

    }

    public static int deleteType(BloodType type) throws ClassNotFoundException, SQLException {

        String query = "Delete from BloodType where BloodType='" + type.getBloodType() + "'";
        Connection connection = DBConnection.getConnectionToDB();
        int res = DBHandler.setData(connection, query);
        return res;

    }

    public static ResultSet getAllTypes() throws ClassNotFoundException, SQLException {
        String query = "Select * From BloodType";
        Connection connection = DBConnection.getConnectionToDB();
        return DBHandler.getData(connection, query);
    }
    
    public static int getTypeCount() throws ClassNotFoundException, SQLException {
        String query = "Select count(*) From BloodType";
        Connection connection = DBConnection.getConnectionToDB();
        ResultSet rst = DBHandler.getData(connection, query);
        while(rst.next()){
            return rst.getInt("count(*)");
        }
        return -1;
    }

}
