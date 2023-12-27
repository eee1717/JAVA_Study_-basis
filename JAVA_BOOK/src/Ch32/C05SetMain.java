package Ch32;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C05SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet();
		
		set.add("JAVA");
		set.add("Android");
		set.add("JSP");
		set.add("OracleDB");
		set.add("SpringFramework");
		set.add("JAVA");	//중복 허용 x
		
		System.out.println("사이즈 : " + set.size());
		
		//조회
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) 	//iter.hasNext() : 다음위치에 요소가 존재하는지 확인
		{
			System.out.println(iter.next()); //해당 위치의 요소를 꺼냄
			
		}
		
		set.remove("JAVA");
		
		set.clear();
		
	}

}
