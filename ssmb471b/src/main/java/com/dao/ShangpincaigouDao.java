package com.dao;

import com.entity.ShangpincaigouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpincaigouVO;
import com.entity.view.ShangpincaigouView;


/**
 * 商品采购
 * 
 * @author 
 * @email 
 * @date 2021-04-08 13:04:28
 */
public interface ShangpincaigouDao extends BaseMapper<ShangpincaigouEntity> {
	
	List<ShangpincaigouVO> selectListVO(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
	ShangpincaigouVO selectVO(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
	List<ShangpincaigouView> selectListView(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);

	List<ShangpincaigouView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
	ShangpincaigouView selectView(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
	
}
