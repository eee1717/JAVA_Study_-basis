package Ch32;

import java.util.*;

public class C07MapMain {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap();
		
		//추가 하기
		if(!map.containsKey("aaa")) {
			map.put("aaa",1234);	
		}
		if(!map.containsKey("bbb")) {
			map.put("bbb",1111);	
		}
		if(!map.containsKey("ccc")) {
			map.put("ccc",2222);
		}
		if(!map.containsKey("aaa")) {
			map.put("aaa",9999);//중복된 Key 전달(마지막 Key:Value저장)
		}
		//개수 확인
		System.out.println("개수 : " + map.size());
		
		//조회 하기
		//1. 모든 Key 수집(Set)
		Set<String> set = map.keySet();
		//2. Iterator 를 통한 key 순회
		Iterator<String> iter = set.iterator();
		//3. 각각 key에 해당되는 value를 추출
		while(iter.hasNext()) {
			String key=iter.next(); //하나 Key 받기
			int value = map.get(key);	//Key에 대응되는 Value꺼내기
			System.out.println("KEY : " + key + ",VALUE : "+value);
		}
		

	}

}
