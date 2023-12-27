package Ch38;

import java.io.*;

public class C01BufferedSubMain {

	public static void main(String[] args) {
		
		try {
		//기본스트림 소요시간확인
		InputStream in = new FileInputStream("c:\\abcd\\dog.jpg");
		OutputStream out = new FileOutputStream("c:\\abcd\\copydog.jpg");
		long time = copyTimer(in,out);
		
		System.out.println("기본스트림 복사 시간 : " + time);
		
		//보조스트림 추가후(버퍼스트림 소요시간 확인)
		InputStream in2 = new FileInputStream("c:\\abcd\\dog.jpg");
		OutputStream out2 = new FileOutputStream("c:\\abcd\\copydog2.jpg");
		//기본스트림에 보조스트림 추가
		BufferedInputStream bin = new BufferedInputStream(in2);
		BufferedOutputStream bout = new BufferedOutputStream(out2);
		
		long time2 = copyTimer(bin,bout);
		System.out.println("보조스트림 복사 시간 : " + time2);
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//파일복사 함수
	public static long copyTimer(InputStream in, OutputStream out) throws IOException {
		long start = System.nanoTime();
		//파일복사
		int data=0;
		while(true) {
			data=in.read(); // -1 : EOF
			if(data==-1) {
				break;
			}
			out.write(data);
			out.flush();
		}
		long end=System.nanoTime();

		return end-start;
	}

}
