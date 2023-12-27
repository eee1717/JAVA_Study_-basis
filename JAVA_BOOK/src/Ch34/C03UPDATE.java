package Ch34;

import java.sql.*;

public class C03UPDATE {

	public static void main(String[] args) {
		
		//연결관련 정보 저장용 변수
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3306/testdb";
		
		//DB연결관련 객체를 위한 참조 변수
		Connection conn=null;				// DB 연결객체
		PreparedStatement pstmt = null;		// SQL 쿼리 전송 객체
		ResultSet rs = null;				// 쿼리결과(Select) 수신용 객체

		//연결
		try {
			//DB Driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success!");
			//DB연결객체 생성
			conn=DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..");
			//SQL전송 객체
			pstmt = conn.prepareStatement("update member_tbl set pw = ? where id = ? ");
			pstmt.setString(1, "9999");
			pstmt.setString(2, "홍길동");
			
			//SQL전송
			int result = pstmt.executeUpdate();
			
			if(result!=0) {
				System.out.println("Update 성공");
			}else {
				System.out.println("Update 실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {		
			try{conn.close();}catch(Exception e1) {e1.printStackTrace();}
			
		}
		

	}

}
