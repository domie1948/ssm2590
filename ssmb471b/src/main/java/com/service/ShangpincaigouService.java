package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpincaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpincaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpincaigouView;


/**
 * 商品采购
 *
 * @author 
 * @email 
 * @date 2021-04-08 13:04:28
 */
public interface ShangpincaigouService extends IService<ShangpincaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpincaigouVO> selectListVO(Wrapper<ShangpincaigouEntity> wrapper);
   	
   	ShangpincaigouVO selectVO(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
   	
   	List<ShangpincaigouView> selectListView(Wrapper<ShangpincaigouEntity> wrapper);
   	
   	ShangpincaigouView selectView(@Param("ew") Wrapper<ShangpincaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpincaigouEntity> wrapper);
   	
}

