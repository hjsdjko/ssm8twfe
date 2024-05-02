package com.entity.vo;

import com.entity.TijiantaocanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 体检套餐
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:01
 */
public class TijiantaocanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐类型
	 */
	
	private String taocanleixing;
		
	/**
	 * 体检项目
	 */
	
	private String tijianxiangmu;
		
	/**
	 * 体检内容
	 */
	
	private String tijianneirong;
		
	/**
	 * 体检地点
	 */
	
	private String tijiandidian;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：套餐类型
	 */
	 
	public void setTaocanleixing(String taocanleixing) {
		this.taocanleixing = taocanleixing;
	}
	
	/**
	 * 获取：套餐类型
	 */
	public String getTaocanleixing() {
		return taocanleixing;
	}
				
	
	/**
	 * 设置：体检项目
	 */
	 
	public void setTijianxiangmu(String tijianxiangmu) {
		this.tijianxiangmu = tijianxiangmu;
	}
	
	/**
	 * 获取：体检项目
	 */
	public String getTijianxiangmu() {
		return tijianxiangmu;
	}
				
	
	/**
	 * 设置：体检内容
	 */
	 
	public void setTijianneirong(String tijianneirong) {
		this.tijianneirong = tijianneirong;
	}
	
	/**
	 * 获取：体检内容
	 */
	public String getTijianneirong() {
		return tijianneirong;
	}
				
	
	/**
	 * 设置：体检地点
	 */
	 
	public void setTijiandidian(String tijiandidian) {
		this.tijiandidian = tijiandidian;
	}
	
	/**
	 * 获取：体检地点
	 */
	public String getTijiandidian() {
		return tijiandidian;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
