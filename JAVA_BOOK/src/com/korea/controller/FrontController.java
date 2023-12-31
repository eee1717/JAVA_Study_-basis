package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.DTO;
import com.korea.view.View;
import com.korea.view.Viewer;

public class FrontController {
	//서브컨트롤러 저장용
	private Map<String,SubController> map = new HashMap();
	
	public FrontController(){
		Init(); //map 에 Init에 지정된 대로 서브컨트롤러가 추가됨
	}
	//등록할 서비스 지정
	private void Init() {
		map.put("BOOK",new BookController());
		map.put("AUTH",new AuthController());
	}
	
	
	//MAP에 있는 서브컨트롤러를 꺼내어 해당 컨트롤러를 실행하는 함수
	public boolean SubControllerEX(String menu,int num, DTO dto,View viewer) {
		SubController tmp;
		if(menu.equals("BOOK")) {
			tmp = map.get("BOOK"); //BookController를 꺼내어 tmp에 연결
			return tmp.execute(num, dto,viewer);	//서브컨트롤러 execute실후 결과(true/false)를 view로전달
													//num : 1(조회) 2(삽입)  3(수정) 4(삭제)
		}
		else if(menu.equals("AUTH")) {
			tmp=map.get("AUTH");//AuthController를 꺼내어 tmp에 연결
			return tmp.execute(num, dto,null); //서브컨트롤러 execute실행 결과(true/false)를 view로 전달
											// num==1 회원로그인 / num==2 직원로그인
		}
		
		
		return false;
	}
	
	
}
