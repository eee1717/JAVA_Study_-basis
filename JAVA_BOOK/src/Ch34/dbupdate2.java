package Ch34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dbupdate2 {

	public static void main(String[] args) {
	
		
		
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/URDO";
		String user = "root";
		String password = "1234";
		
		
		//연결에 사용될 참조변수
		String sql; 					//sql 문저장
		PreparedStatement pstmt =null;	//sql문 명령 전달하는 용도
		ResultSet rs = null;			//쿼리 결과 저장
		Connection con = null;			//연결 정보 저장
			

		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			con=DriverManager.getConnection(url,user,password);
			System.out.println("DB Connected..");
			sql="update member_tbl set pw=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "9999999");
			pstmt.setString(2, "test123");
			
			int num = pstmt.executeUpdate();
			
			if(num==1)
			{
				System.out.println("Update Succeed.성공!!");
			}

		
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
			try {
				if(rs!=null)
					rs.close();
			}catch(Exception e1) {};
			
			try {
				if(pstmt!=null)
					pstmt.close();
			}catch(Exception e2) {}
			
			try {
				if(con !=null)
					con.close();
			}catch(Exception e) {}	
		}

		
		
		
		
		
		
		
		
		

	}

}
