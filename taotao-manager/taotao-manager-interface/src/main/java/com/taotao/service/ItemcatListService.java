package com.taotao.service;

import java.util.List;

public interface ItemcatListService {
	
	/**
	 * 商品分类树形目录
	 * @param parentId
	 * @return
	 */
	public List getItemcatList(Long parentId);

}
