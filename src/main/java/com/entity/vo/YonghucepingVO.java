package com.entity.vo;

import com.entity.YonghucepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户测评
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public class YonghucepingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 测评类型
	 */
	
	private String cepingleixing;
		
	/**
	 * 题目一
	 */
	
	private String timuyi;
		
	/**
	 * 选项一
	 */
	
	private String xuanxiangyi;
		
	/**
	 * 题目二
	 */
	
	private String timuer;
		
	/**
	 * 选项二
	 */
	
	private String xuanxianger;
		
	/**
	 * 题目三
	 */
	
	private String timusan;
		
	/**
	 * 选项三
	 */
	
	private String xuanxiangsan;
		
	/**
	 * 题目四
	 */
	
	private String timusi;
		
	/**
	 * 选项四
	 */
	
	private String xuanxiangsi;
		
	/**
	 * 题目五
	 */
	
	private String timuwu;
		
	/**
	 * 选项五
	 */
	
	private String xuanxiangwu;
		
	/**
	 * 题目六
	 */
	
	private String timuliu;
		
	/**
	 * 选项六
	 */
	
	private String xuanxiangliu;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
				
	
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
	 * 设置：选项一
	 */
	 
	public void setXuanxiangyi(String xuanxiangyi) {
		this.xuanxiangyi = xuanxiangyi;
	}
	
	/**
	 * 获取：选项一
	 */
	public String getXuanxiangyi() {
		return xuanxiangyi;
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
	 * 设置：选项二
	 */
	 
	public void setXuanxianger(String xuanxianger) {
		this.xuanxianger = xuanxianger;
	}
	
	/**
	 * 获取：选项二
	 */
	public String getXuanxianger() {
		return xuanxianger;
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
	 * 设置：选项三
	 */
	 
	public void setXuanxiangsan(String xuanxiangsan) {
		this.xuanxiangsan = xuanxiangsan;
	}
	
	/**
	 * 获取：选项三
	 */
	public String getXuanxiangsan() {
		return xuanxiangsan;
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
	 * 设置：选项四
	 */
	 
	public void setXuanxiangsi(String xuanxiangsi) {
		this.xuanxiangsi = xuanxiangsi;
	}
	
	/**
	 * 获取：选项四
	 */
	public String getXuanxiangsi() {
		return xuanxiangsi;
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
	 * 设置：选项五
	 */
	 
	public void setXuanxiangwu(String xuanxiangwu) {
		this.xuanxiangwu = xuanxiangwu;
	}
	
	/**
	 * 获取：选项五
	 */
	public String getXuanxiangwu() {
		return xuanxiangwu;
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
	 * 设置：选项六
	 */
	 
	public void setXuanxiangliu(String xuanxiangliu) {
		this.xuanxiangliu = xuanxiangliu;
	}
	
	/**
	 * 获取：选项六
	 */
	public String getXuanxiangliu() {
		return xuanxiangliu;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
				
	
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
			
}
