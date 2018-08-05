package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUITreeNode;

public interface ContentCategoryService {
	
	/**
	 * 处理内容管理目录
	 * @param parentId
	 * @return
	 */
	public List<EasyUITreeNode> getContentCategoryList(Long parentId);
}
