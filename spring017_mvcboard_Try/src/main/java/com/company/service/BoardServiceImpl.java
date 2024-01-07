package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.BDao;
import com.company.dto.BDto;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{

	@Autowired BDao dao;
	@Override public List<BDto> readAll() { return dao.readAll(); }
	@Override public int insert(BDto dto) { return dao.insert(dto); }
	@Override public int update_bhit(int bno) { return dao.update_bhit(bno); }
	@Override public BDto select(int bno) { return dao.select(bno); }
	@Override public int update(BDto dto) { return dao.update(dto); }
	@Override public int delete(BDto dto) { return dao.delete(dto); }
}
