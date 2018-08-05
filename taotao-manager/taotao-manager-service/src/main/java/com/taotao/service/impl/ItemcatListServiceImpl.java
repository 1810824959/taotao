package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemcatListService;

@Service
public class ItemcatListServiceImpl implements ItemcatListService {
	@Autowired
	private TbItemCatMapper mapper;
	
	@Override
	public List getItemcatList(Long parentId) {
		
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		
		List<TbItemCat> list = mapper.selectByExample(example);
		
		ArrayList<EasyUITreeNode> resultList = new ArrayList<>();
		
		for (TbItemCat easyUITreeNode : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(easyUITreeNode.getId());
			node.setText(easyUITreeNode.getName());
			node.setState(easyUITreeNode.getIsParent()?"closed":"open");
			resultList.add(node);
		}
		
		return resultList;
	}

}
