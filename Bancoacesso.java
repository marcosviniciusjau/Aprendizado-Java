

import java.sql.ResultSet; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Bancoacesso {

	public static void main(String[] args) {
		String sql = "select codigo,nome,sexo,email from PESSOA";
		String url= "jdbc:oracle:thin:@localhost::1521:xe";
		
		try{Connection con = DriverManager.getConnection(url, "curso","curso1234");}
    PreparedStatement stm= con.prepareStatement(sql);
			ResultSet rs= stm.executeQuery()}
            {
				while(rs.next())} {
					System.out.println(rs.getString("nome"));
				}
			}
	}

}
