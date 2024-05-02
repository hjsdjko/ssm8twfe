package com.entity.view;

import com.entity.JiankangcepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康测评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
@TableName("jiankangceping")
public class JiankangcepingView  extends JiankangcepingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangcepingView(){
	}
 
 	public JiankangcepingView(JiankangcepingEntity jiankangcepingEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangcepingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
