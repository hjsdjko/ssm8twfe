package com.entity.view;

import com.entity.TaocanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 套餐项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:01
 */
@TableName("taocanxiangmu")
public class TaocanxiangmuView  extends TaocanxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocanxiangmuView(){
	}
 
 	public TaocanxiangmuView(TaocanxiangmuEntity taocanxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, taocanxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
