package Test;

import java.sql.*;
import java.util.Scanner;

public class DbUtil {
    public static final String URL = "jdbc:mysql://localhost:3306/db_blog?serverTimezone=GMT";
    public static final String USER = "root";
    public static final String PASSWORD = "root";


    public static void main(String[] args) throws Exception {
        //        String url = "jdbc:mysql://localhost:3306/db_blog?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        PreparedStatement ps = null;
        try {
            String sql = "insert into user(u_name,u_passwd,u_photo,u_last_time) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < 5; i++) {
                ps.setString(1, "lqr" + i);
                ps.setString(2, "521");
                ps.setString(3, "5211314");
                ps.setString(4, "2021-07-06 09:26:40");
                ps.executeUpdate();
            }
            System.out.println("数据已插入，即将开始查询");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            String selectsql = "select * from user";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(selectsql);
            System.out.println("数据查询完毕");
            while (rs.next()) {
                System.out.println("查询到数据正在输出……");
                Integer uid = rs.getInt("u_id");
                String name = rs.getString("u_name");
                Integer password = rs.getInt("u_passwd");
                Integer photo = rs.getInt("u_photo");
                System.out.println("id" + uid + "姓名" + name + "号码" + password + "代号" + photo);
            }

            System.out.println("数据查询完毕");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            System.out.println("数据查询完毕即将进入数据修改阶段");
            String updatesql = "update user set u_name=?,u_passwd=?,u_photo=?,u_last_time=? where u_id=?";

            ps = conn.prepareStatement(updatesql);
            ps.setString(1, "shenchen");
            ps.setInt(2, 1997);
            ps.setInt(3, 1206);
            ps.setString(4, "2021-07-06 09:26:40");
            ps.setInt(5, 118);
            int upa = ps.executeUpdate();
            if (upa > 0) {

                System.out.println("数据已修改");
                String selectsql = "select * from user where u_id=118";
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(selectsql);
                System.out.println("数据查询完毕");
                while (rs.next()) {
                    System.out.println("查询到数据正在输出……");
                    String name = rs.getString("u_name");
                    Integer password = rs.getInt("u_passwd");
                    Integer photo = rs.getInt("u_photo");
                    System.out.println("姓名" + name + "号码" + password + "代号" + photo);
                }

                System.out.println("数据查询完毕");
            } else {
                System.out.println("修改失败，请检查");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            System.out.println("开始清理数据，请根据ID选择您要删除的数据");
            Scanner sc = new Scanner(System.in);
            int xuanze = sc.nextInt();
            for (int j=0;j<xuanze;j++){
                String delsql = "delete from user where u_id=?";
                ps = conn.prepareStatement(delsql);
                ps.setInt(1,j);
                System.out.println("j"+j);
                int dela = ps.executeUpdate();
                System.out.println("dela"+dela);
                if (dela > 0) {
                    System.out.println("数据已删除");
                } else {
                    System.out.println("删除失败");
                }
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        conn.close();
    }
}
