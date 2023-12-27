package Ch34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class insert2 {

	public static void main(String[] args) {
	
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String password = "1234";
		
		
		//연결에 사용될 참조변수
		String sql; 					//sql 문저장
		PreparedStatement pstmt =null;	//sql문 명령 전달하는 용도
		ResultSet rs = null;			//쿼리 결과 저장
		Connection conn = null;			//연결 정보 저장

		
		
		
		try {
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			conn=DriverManager.getConnection(url,user,password);
			System.out.println("DB Connected..");
			
			sql="insert into member_tbl values(?,?,?)";
			
			//SQL 전송객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "ccc");
			pstmt.setString(2, "씨이");
			pstmt.setString(3, "30");
		
			//SQL전송
			int num = pstmt.executeUpdate();	
		
			
			if(num==1)
			{
				System.out.println("Insert Succeed");
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
				if(conn !=null)
					conn.close();
			}catch(Exception e) {}	
		}
		
		
		
		
		
		
	}

}
