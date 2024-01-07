package com.company.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.dto.BDto;
import com.company.service.BoardService;

@Controller
public class BoardController {

	@Autowired BoardService service;

	//글목록부르기
	@RequestMapping( value="/list.board" , method=RequestMethod.GET )
	public String list(Model model) {
		model.addAttribute("list", service.readAll());
		return "list";
	}
	
	//글쓰기 입장
	@RequestMapping("/write_view.board")
	public String writeView() {
		return "write";
	}

	//글쓰기
	@RequestMapping(value="/insert.board" , method=RequestMethod.POST)
	public String insert( @ModelAttribute BDto dto ) {
		try { dto.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		if(dto != null) { service.insert(dto); }
		return "redirect:/list.board";
	}

	//상세보기
	@RequestMapping(value="/detail.board" , method=RequestMethod.GET)
	public String detail( Model model , @RequestParam int bno ) {
		model.addAttribute("dto", service.update_bhit(bno));
		model.addAttribute("dto", service.select(bno));
		return "detail";
	}

	//글수정 입장
	@RequestMapping(value="/edit_view.board" , method=RequestMethod.GET)
	public String edit_view( Model model , @RequestParam int bno ) {
		model.addAttribute("dto", service.select(bno));
		return "edit";
	}

	//글수정
	@RequestMapping(value="/edit.board" , method=RequestMethod.POST)
	public String update( @ModelAttribute BDto dto) {
		if(dto != null) {
			service.update(dto);
			return "redirect:/detail.board?bno="+dto.getBno();
		}
		return "redirect:/edit_view.board";
	}

	//삭제 입장
	@RequestMapping("/delete_view.board" )
	public String deleteView( Model model , @RequestParam int bno)
		{ return "delete"; }

	//삭제하기
	@RequestMapping(value="/delete.board" , method=RequestMethod.POST)
	public String delete(@ModelAttribute BDto dto ) {
		service.delete(dto);
		if(dto != null) {
			service.delete(dto);
			return "redirect:/list.board";
		}
		return "redirect:/delete_view.board";
	}
	
}



