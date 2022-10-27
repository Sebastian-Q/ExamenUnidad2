package tienda.util;

import java.sql.*;

public class ConnectionMySQL {
    public static Connection getConnection () throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","");
    }


    public static void main(String[] args) {
        try {
            Connection con = getConnection();
            System.out.println("¡Conexion Exitosa!");
            con.close();
        } catch (SQLException e) {
            System.out.println("¡Conexion Fallida! " + e);
        }
    }

    public void close(Connection conn, PreparedStatement ps, ResultSet rs){
        try {
            if (conn!=null)
                conn.close();
            if (ps!=null)
                ps.close();
            if (rs!=null)
                rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
