package Ch39;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class C03ServerSocket{

	public static void main(String[] args) {
		ServerSocket server=null;
		Socket client = null;
		InputStream in=null;
		DataInputStream Din=null;
		try {
			//IP : 192.168.5.50 , Port : 5050
			server = new ServerSocket(6060);
			System.out.println("서버 통신 서비스 시작!");
			
			while(true)
			{

				client = server.accept(); // Client 접속 요청시 
											 // Client객체 생성(IN/OUT스트림연결)
			
				//데이터 전송용 스트림
				in = client.getInputStream();
				Din = new DataInputStream(in);	
				String message = Din.readUTF();
				System.out.println(client.getInetAddress()+"로부터 메시지 시작---");
				System.out.println(message+"\n");
				System.out.println(client.getInetAddress()+"로부터 메시지 끝---");
				
				
				in.close();
				
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{server.close();}catch(Exception e) {e.printStackTrace();}
		}

	}



}
