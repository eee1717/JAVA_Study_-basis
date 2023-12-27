package Ch37;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01ReaderMain {

	public static void main(String[] args) {

		try {

		
		Reader in = new FileReader("c:\\abcd\\test.txt");
		while(true) {
			int data = in.read(); 
			if(data==-1) {
				break;
			}
			System.out.print((char)data);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
