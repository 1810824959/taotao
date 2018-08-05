package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.service.itemService;

@Controller
public class pageController {
	
	@Autowired
	private itemService itemService;
	
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}

	@RequestMapping("/{page}")
	public String showitem_list(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItmList(
			@RequestParam(value = "page",required = false,defaultValue = "1") Integer page,
			@RequestParam(value = "rows",required = false,defaultValue = "30")Integer rows){
		return itemService.getItemList(page, rows);
		
	}
}
