package Test;

import java.sql.*;
import java.util.Scanner;

/**
 * \*Created with Intellij IDEA
 * \*User: Administrator
 * \*Date: 2021/7/6
 * \*Time: 14:54
 * \*Description:
 */

public class JdbcUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/db_blog?serverTimezone=GMT";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        selectAll();
    }

    public static void selectAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要查询的id");
        int wr=sc.nextInt();

        Connection conn  = DriverManager.getConnection(URL, USER, PASSWORD);
        String selectSql="select * from user where u_id=?";
        Statement st = conn.createStatement();
        ResultSet rs =st.executeQuery(selectSql);
        PreparedStatement ps=conn.prepareStatement(selectSql);
        ps.setInt(1,wr);
        System.out.println(wr);
        while (rs.next()){
            System.out.println("查询到数据");
            String id=rs.getString("u_id");
            String name=rs.getString("u_name");
            String passwd=rs.getString("u_passwd");
            String photo=rs.getString("u_photo");
            String ptime=rs.getString("u_last_time");
            System.out.println(id+name+passwd+photo+ptime);
        }

    }


}
