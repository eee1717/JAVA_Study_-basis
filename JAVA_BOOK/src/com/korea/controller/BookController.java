package com.korea.controller;

import com.korea.dto.BookDTO;
import com.korea.dto.DTO;
import com.korea.service.BookService;
import com.korea.view.View;
import com.korea.view.Viewer;
import com.mysql.cj.protocol.Resultset;

public class BookController implements SubController{
	BookService service = new BookService();
	
	@Override
	public boolean execute(int num, DTO dto,View viewer) {
			//다운캐스팅
			BookDTO bdto = (BookDTO)dto;
			
			//조회 1,삽입 2,수정 3,삭제 4
			if(num==1){
				try {
					return  service.Select(bdto,viewer);
				}catch(Exception e) {
					e.printStackTrace();
				}
				return true;
				
			}else if(num==2) {
				return service.Insert(bdto);
				
			}else if(num==3) {
				
			}else if(num==4) {
				
			}
		
		return false;
	}


}
