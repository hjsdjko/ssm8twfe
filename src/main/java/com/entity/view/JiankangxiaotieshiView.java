package com.entity.view;

import com.entity.JiankangxiaotieshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康小贴士
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
@TableName("jiankangxiaotieshi")
public class JiankangxiaotieshiView  extends JiankangxiaotieshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangxiaotieshiView(){
	}
 
 	public JiankangxiaotieshiView(JiankangxiaotieshiEntity jiankangxiaotieshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangxiaotieshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
