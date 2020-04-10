package com.wsp.event.entity;
/**
 * 对应管理员登陆的表
 * @author WSP
 * @Date 2020年4月5日
 */
public class LoadMassager {
	private int massagerId;
	private String massagerCiper;
	
    public void setMassagerCiper(String massagerCiper) {
		this.massagerCiper = massagerCiper; 
	} 
    
    public int getMassagerId() {
		return this.massagerId;
	}
    
    public String getMassagerCiper() {
		return this.massagerCiper;
	}
}
