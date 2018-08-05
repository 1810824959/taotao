package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.content.service.ContentCategoryService;
import com.taotao.service.ItemcatListService;


@Controller
public class EasyUITreeListController {
	@Autowired
	private ItemcatListService itemcatService;
	
	@Autowired
	private ContentCategoryService categoryService;
	
	
	/**
	 * 新建商品选择类目
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List getItemcatList(@RequestParam(value="id",required=false,defaultValue="0")Long parentId){
		List list = itemcatService.getItemcatList(parentId);
		return list;
	}
	
	
	@RequestMapping("/content/category/list")
	@ResponseBody
	public List getItemCategoryList(@RequestParam(value="id",required=false,defaultValue="0")Long parentId){
		List list = categoryService.getContentCategoryList(parentId);
		return list;
	}
}
