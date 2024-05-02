package com.entity.model;

import com.entity.JiankangcepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健康测评
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public class JiankangcepingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 测评类型
	 */
	
	private String cepingleixing;
		
	/**
	 * 测试简介
	 */
	
	private String ceshijianjie;
		
	/**
	 * 测评规则
	 */
	
	private String cepingguize;
		
	/**
	 * 题目一
	 */
	
	private String timuyi;
		
	/**
	 * 题目二
	 */
	
	private String timuer;
		
	/**
	 * 题目三
	 */
	
	private String timusan;
		
	/**
	 * 题目四
	 */
	
	private String timusi;
		
	/**
	 * 题目五
	 */
	
	private String timuwu;
		
	/**
	 * 题目六
	 */
	
	private String timuliu;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：测评类型
	 */
	 
	public void setCepingleixing(String cepingleixing) {
		this.cepingleixing = cepingleixing;
	}
	
	/**
	 * 获取：测评类型
	 */
	public String getCepingleixing() {
		return cepingleixing;
	}
				
	
	/**
	 * 设置：测试简介
	 */
	 
	public void setCeshijianjie(String ceshijianjie) {
		this.ceshijianjie = ceshijianjie;
	}
	
	/**
	 * 获取：测试简介
	 */
	public String getCeshijianjie() {
		return ceshijianjie;
	}
				
	
	/**
	 * 设置：测评规则
	 */
	 
	public void setCepingguize(String cepingguize) {
		this.cepingguize = cepingguize;
	}
	
	/**
	 * 获取：测评规则
	 */
	public String getCepingguize() {
		return cepingguize;
	}
				
	
	/**
	 * 设置：题目一
	 */
	 
	public void setTimuyi(String timuyi) {
		this.timuyi = timuyi;
	}
	
	/**
	 * 获取：题目一
	 */
	public String getTimuyi() {
		return timuyi;
	}
				
	
	/**
	 * 设置：题目二
	 */
	 
	public void setTimuer(String timuer) {
		this.timuer = timuer;
	}
	
	/**
	 * 获取：题目二
	 */
	public String getTimuer() {
		return timuer;
	}
				
	
	/**
	 * 设置：题目三
	 */
	 
	public void setTimusan(String timusan) {
		this.timusan = timusan;
	}
	
	/**
	 * 获取：题目三
	 */
	public String getTimusan() {
		return timusan;
	}
				
	
	/**
	 * 设置：题目四
	 */
	 
	public void setTimusi(String timusi) {
		this.timusi = timusi;
	}
	
	/**
	 * 获取：题目四
	 */
	public String getTimusi() {
		return timusi;
	}
				
	
	/**
	 * 设置：题目五
	 */
	 
	public void setTimuwu(String timuwu) {
		this.timuwu = timuwu;
	}
	
	/**
	 * 获取：题目五
	 */
	public String getTimuwu() {
		return timuwu;
	}
				
	
	/**
	 * 设置：题目六
	 */
	 
	public void setTimuliu(String timuliu) {
		this.timuliu = timuliu;
	}
	
	/**
	 * 获取：题目六
	 */
	public String getTimuliu() {
		return timuliu;
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
