package Ch41;

import java.io.DataInputStream;
import java.net.Socket;

import Ch42.ServerUI;

public class ServerRecvThread  implements Runnable{

	Socket client;
	DataInputStream Din;
	public ServerRecvThread(Socket client){
		this.client=client;
	}
	


	@Override
	public void run() {
		
		try {
			Din = new DataInputStream(client.getInputStream());
			String recv;
			while(true)
			{
				recv=Din.readUTF(); //클라이언트의 전달 메시지를 수신
				if(recv==null || recv.equals("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(-1);
				}
				System.out.println("\r[Client] : " + recv);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
