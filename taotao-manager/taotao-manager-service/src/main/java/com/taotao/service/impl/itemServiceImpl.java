package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.itemService;

@Service
public class itemServiceImpl implements itemService {
	
	@Autowired
	private TbItemMapper itemmapper;

	@Override
	public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
		PageHelper.startPage(page,rows);
		TbItemExample tbItemExample = new TbItemExample();
		
		List<TbItem> list = itemmapper.selectByExample(tbItemExample);
		
		
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal((int) pageInfo.getTotal());
		result.setRows(list);
		
		return result;
	
	}

}
