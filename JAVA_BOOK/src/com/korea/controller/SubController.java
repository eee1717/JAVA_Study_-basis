package com.korea.controller;

import java.sql.ResultSet;

import com.korea.dto.DTO;
import com.korea.view.View;
import com.korea.view.Viewer;

public interface SubController {
	
	boolean execute(int num,DTO dto,View viewer);
}
