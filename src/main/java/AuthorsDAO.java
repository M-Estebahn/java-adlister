import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDAO implements Authors{
    private Connection connection;



    public  AuthorsDAO(){
        try {
            Config config=new Config();
//            get driver
            DriverManager.registerDriver(new Driver());
//            create connection obj
             connection= DriverManager.getConnection(config.getURL(),config.getUser(),config.getPassword());
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }



    @Override
    public List<Author> all() {
        List<Author> authors= new ArrayList<>();
        try {
//            create statement obj
            Statement statement=connection.createStatement();
//            execute statement and get results
            ResultSet rs=statement.executeQuery("SELECT * FROM codeup_test_db.authors");
            while (rs.next()){
                Author author=new Author(
                        rs.getLong("id"),
                        rs.getString("author_name")
                        );
                authors.add(author);
            }
        }catch (SQLException sqle){
            throw new RuntimeException("error connecting to DB",sqle);
        }
        return authors;
    }

    @Override
    public void insert(Author author) {


    }
}
