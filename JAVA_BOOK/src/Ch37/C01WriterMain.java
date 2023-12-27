package Ch37;

import java.io.FileWriter;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) {
		try {
			//두번째 true : 추가하기 , false : 덮어쓰기
			Writer out = new FileWriter("c:\\abcd\\test.txt",true);
			out.write("a\n");
			out.write("bbb\n");
			out.write("cccc\n");
			out.write("ddddd\n");
			
			out.flush();	//스트림 버퍼 초기화
			out.close();	//스트림 제거
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
