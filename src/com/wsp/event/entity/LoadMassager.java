package com.wsp.event.entity;
/**
 * ��Ӧ����Ա��½�ı�
 * @author WSP
 * @Date 2020��4��5��
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
