package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;

public interface itemService {
	/**
	 * 查看所有商品目录
	 * @param page
	 * @param rows
	 * @return
	 */
	public EasyUIDataGridResult getItemList(Integer page,Integer rows);

}
