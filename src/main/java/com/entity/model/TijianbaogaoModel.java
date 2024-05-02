package com.entity.model;

import com.entity.TijianbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 体检报告
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public class TijianbaogaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 套餐名称
	 */
	
	private String taocanmingcheng;
		
	/**
	 * 套餐类型
	 */
	
	private String taocanleixing;
		
	/**
	 * 体检项目
	 */
	
	private String tijianxiangmu;
		
	/**
	 * 体检结果
	 */
	
	private String tijianjieguo;
		
	/**
	 * 报告文件
	 */
	
	private String baogaowenjian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：套餐名称
	 */
	 
	public void setTaocanmingcheng(String taocanmingcheng) {
		this.taocanmingcheng = taocanmingcheng;
	}
	
	/**
	 * 获取：套餐名称
	 */
	public String getTaocanmingcheng() {
		return taocanmingcheng;
	}
				
	
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
	 * 设置：体检结果
	 */
	 
	public void setTijianjieguo(String tijianjieguo) {
		this.tijianjieguo = tijianjieguo;
	}
	
	/**
	 * 获取：体检结果
	 */
	public String getTijianjieguo() {
		return tijianjieguo;
	}
				
	
	/**
	 * 设置：报告文件
	 */
	 
	public void setBaogaowenjian(String baogaowenjian) {
		this.baogaowenjian = baogaowenjian;
	}
	
	/**
	 * 获取：报告文件
	 */
	public String getBaogaowenjian() {
		return baogaowenjian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
