package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 用户测评
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
@TableName("yonghuceping")
public class YonghucepingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghucepingEntity() {
		
	}
	
	public YonghucepingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 测评名称
	 */
					
	private String cepingmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：测评名称
	 */
	public void setCepingmingcheng(String cepingmingcheng) {
		this.cepingmingcheng = cepingmingcheng;
	}
	/**
	 * 获取：测评名称
	 */
	public String getCepingmingcheng() {
		return cepingmingcheng;
	}
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
