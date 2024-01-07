package com.company.service;

import java.util.List;

import com.company.dto.BDto;

public interface BoardService {
	//글목록
	public List<BDto> readAll();
	//글쓰기
	public int insert(BDto dto);
	//조회수 올리기
	public int update_bhit(int bno);
	//상세보기
	public BDto select(int bno);
	
	//수정
	public int update(BDto dto);
	
	//삭제
	public int delete(BDto dto);
	
}
