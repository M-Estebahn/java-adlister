import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlAdsDao implements Ads{
    private Connection connection;

    public MySqlAdsDao(Config config){
        try {

            // Get the driver into our app
            DriverManager.registerDriver(new Driver());
            // Create the Connection object
            connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }

    }


    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while (rs.next()){
                Ad ad = new Ad(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
        return ads;
    }


    @Override
    public Long insert(Ad ad) {
        long adId = ad.getId();
        long userId=ad.getUserId();
        String adTitle=ad.getTitle();
        String adDescription=ad.getDescription();

        String query = "INSERT INTO adlister_db.ads (id,user_id,title,description) VALUES ('"+adId+"','"+userId+"','"+adTitle+"','"+adDescription+"')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
            return key;
        } catch (SQLException sqle){
            throw new RuntimeException("error connecting to db", sqle);
        }
    }
    }

