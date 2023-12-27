package com.korea.service;

import java.sql.ResultSet;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;
import com.korea.view.View;
import com.korea.view.Viewer;

public class BookService {
	//멤버
	BookDAO dao = new BookDAO();
	public BookService(){
		
	}
	
	//조회
	public boolean Select(BookDTO dto,View viewer) {
		ResultSet rs = dao.Select(dto);
		
		//viewer.연결처리코드 추가
		
		return false;
	}
	//추가
	public boolean Insert(BookDTO dto) {
		return dao.Insert(dto);	//전달받은 dto를 dao로 넘김
								//그리고 반환되는값을 Controller로 전달(true/false)
	}
	//수정
	
	//삭제
	
	
	
}
