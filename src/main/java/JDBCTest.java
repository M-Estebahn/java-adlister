import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    private static List<String> getAuthorNames(){
        List<String> authorNames = new ArrayList<>();
        try {
            Config config=new Config();
//            get driver
            DriverManager.registerDriver(new Driver());
//            create connection obj
            Connection connection= DriverManager.getConnection(config.getURL(),config.getUser(), config.getPassword());
//            create statement obj
            Statement statement=connection.createStatement();
//            execute statement and get results
            ResultSet rs=statement.executeQuery("SELECT author_name FROM codeup_test_db.authors");

            while (rs.next()){
                authorNames.add(rs.getString("author_name"));
            }

        }catch (SQLException sqle){
            sqle.printStackTrace();
        }


        return authorNames;
    }

    public static void main(String[] args) {
        List<String> authorNames= getAuthorNames();
        for(String name: authorNames){
            System.out.println(name);
        }
    }
}
