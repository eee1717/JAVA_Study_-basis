package Ch37;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class C04FileInputStream {

	public static void main(String[] args) {
		
		try {
			
			InputStream in = new FileInputStream("c:\\abcd\\C03Test.exe");
			
			while(true) {
				int data = in.read();
				if(data==-1) {
					break;
				}
				System.out.println((char)data);
			
		
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
