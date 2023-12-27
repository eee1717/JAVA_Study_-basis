package Ch37;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C05FileCopy {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream("c:\\abcd\\cmd.exe");		
			OutputStream out = new FileOutputStream("c:\\abcd\\Copycmd.exe");

			byte [] buffer = new byte[4096]; //4Kbyte 단위로 수신
			
			while(true) {
				
				int num = in.read(buffer);
				if(num==-1) {
					break;
				}
				out.write(buffer,0,num);//buffer에저장된 배열을
										//0 idx 번부터 num까지범위를 out연결된 파일에 전달
				out.flush();
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
