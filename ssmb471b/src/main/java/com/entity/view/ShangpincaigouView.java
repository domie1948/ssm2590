package com.entity.view;

import com.entity.ShangpincaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品采购
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 13:04:28
 */
@TableName("shangpincaigou")
public class ShangpincaigouView  extends ShangpincaigouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpincaigouView(){
	}
 
 	public ShangpincaigouView(ShangpincaigouEntity shangpincaigouEntity){
 	try {
			BeanUtils.copyProperties(this, shangpincaigouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
