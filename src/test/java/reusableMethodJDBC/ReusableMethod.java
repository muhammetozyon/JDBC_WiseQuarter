package reusableMethodJDBC;

import java.sql.*;

public class ReusableMethod {


    public static Connection setUpConnection(){

        /*
        Wonder World College Database Access Information
        type : jdbc:mysql
        host/ip : 194.140.198.209
        port : 3306
        database_name : wonderworld_qa2
        username : wonderworld_qawcollegeuser
        password :1gvyfx6#Q

        URL: "jdbc:mysql://194.140.198.209/wonderworld_qa2";
        USERNAME= "wonderworld_qawcollegeuser";
        PASSWORD="1gvyfx6#Q";
                 */

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://194.140.198.209/wonderworld_qa2",
                    "wonderworld_qawcollegeuser",
                    "1gvyfx6#Q");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }


    public static Statement setUpStatement(Connection connection){

        Statement statement = null;

        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return statement;
    }


}