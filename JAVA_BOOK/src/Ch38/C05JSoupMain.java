package Ch38;

import java.io.*;
import java.net.URL;
import java.sql.Connection;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class C05JSoupMain {

	public static void main(String[] args) {
		
		try {
			
			//URL과 연결된 JSoup 객체 생성
			Connection conn = Jsoup.connect("https://www.naver.com/");
			
			//해당 URL의 모든 소스를 DOM객체에 저장
			Document document = conn.get();
			//System.out.print(document);
			
			URL url=null;
			
			//DOM객체 안에서 img 태그를 가지는 요소만 추출
			Elements elements = document.getElementsByTag("img");
			
			for(int i=0;i<elements.size();i++) {
				
				if(elements.get(i).toString().contains("http"))//해당 요소가 http문자열을 가지는가?
				{
					
					//" "을 기준으로 요소 안의 내용을 문자열로 바꾼뒤 잘라내기
					String str[] = elements.get(i).toString().split(" ");
					//" 문자다음 위치를 시작 Idx로 지정
					int  BeginIdx = str[1].indexOf("\"")+1;
					//http시작으로 하는 URL을 추출해기
					String tmp = str[1].substring(BeginIdx, str[1].length()-1);
					System.out.println(tmp);
				
					//URL 연결하기
					url = new URL(tmp.toString());
					InputStream in = url.openStream();
					BufferedInputStream bin = new BufferedInputStream(in);
					String filename="Image";
					OutputStream out = new FileOutputStream("c:\\abcd\\"+filename+i+".png");
					int data=0;
					while(true) {
						data=bin.read();
						if(data==-1)
							break;
						//writer로 지정된 위치에 저장
						out.write(data);
						out.flush();
					}
				
				} //if
				
			} //for
			 
			
			
			//String srcList[] = document.get
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
