package com.entity.model;

import com.entity.CeshibaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 测试报告
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-01 11:49:02
 */
public class CeshibaogaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
