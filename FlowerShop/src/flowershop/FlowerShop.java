package flowershop;

import java.sql.*;

public class FlowerShop {

    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowers", "florist", "engeto123+");
            Statement statement = con.createStatement();
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('bledule', 'bílá', 1)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('kopretina', 'bílá', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('pampeliška', 'žlutá', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('vlčí mák', 'červená', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('chrpa', 'modrá', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('česnek obrovský', 'fialová', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('tulipán červený', 'červená', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('tulipán oranžový', 'oranžová', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('tulipán růžový', 'růžová', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('tulipán bílý', 'bílá', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('houstinue modrá', 'světle modrá', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('orchidej modrá', 'modrá', 0)");
            statement.executeUpdate("insert into Flowers (name, color, poisonous) values ('konvalinka', 'bílá', 1)");
            statement.executeUpdate("update flowers set description = 'Pozor na cibulku, obsahuje nejvyšší koncentraci jedu!' where name = 'bledule'");
            statement.executeUpdate("delete from Flowers where poisonous = 0");
            ResultSet resultset = statement.executeQuery("select * from Flowers");
            while(resultset.next()){
                System.out.println(resultset.getString("name"));
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
