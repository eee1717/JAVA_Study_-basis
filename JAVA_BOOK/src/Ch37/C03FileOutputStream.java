package Ch37;

import java.io.*;

public class C03FileOutputStream {

	public static void main(String[] args) {
		
		try {
			
			OutputStream out = new FileOutputStream("c:\\abcd\\C03Test.exe"); 
			out.write('가'); 
			out.write('나');
			out.write('다');
			out.write('라');
			
			out.flush();
			out.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
