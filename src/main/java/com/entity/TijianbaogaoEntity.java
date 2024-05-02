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
 * 体检报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
@TableName("tijianbaogao")
public class TijianbaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TijianbaogaoEntity() {
		
	}
	
	public TijianbaogaoEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
