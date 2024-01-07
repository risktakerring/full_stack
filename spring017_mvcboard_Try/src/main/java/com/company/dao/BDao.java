package com.company.dao;

import java.util.List;

import com.company.dto.BDto;

@MyDao
public interface BDao {

	public List<BDto> readAll();
	public int insert(BDto dto);
	public int update_bhit(int bno);
	public BDto select(int bno);
	public int update(BDto dto);
	public int delete(BDto dto);

}
