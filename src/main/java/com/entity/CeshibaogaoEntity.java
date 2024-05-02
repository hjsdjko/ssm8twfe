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
 * 测试报告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
@TableName("ceshibaogao")
public class CeshibaogaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CeshibaogaoEntity() {
		
	}
	
	public CeshibaogaoEntity(T t) {
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
	 * 测评报告
	 */
					
	private String cepingbaogao;
	
	/**
	 * 评分
	 */
					
	private Integer pingfen;
	
	/**
	 * 医生建议
	 */
					
	private String yishengjianyi;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：测评报告
	 */
	public void setCepingbaogao(String cepingbaogao) {
		this.cepingbaogao = cepingbaogao;
	}
	/**
	 * 获取：测评报告
	 */
	public String getCepingbaogao() {
		return cepingbaogao;
	}
	/**
	 * 设置：评分
	 */
	public void setPingfen(Integer pingfen) {
		this.pingfen = pingfen;
	}
	/**
	 * 获取：评分
	 */
	public Integer getPingfen() {
		return pingfen;
	}
	/**
	 * 设置：医生建议
	 */
	public void setYishengjianyi(String yishengjianyi) {
		this.yishengjianyi = yishengjianyi;
	}
	/**
	 * 获取：医生建议
	 */
	public String getYishengjianyi() {
		return yishengjianyi;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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

}
