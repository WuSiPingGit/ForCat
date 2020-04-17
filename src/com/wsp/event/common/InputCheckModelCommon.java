package com.wsp.event.common;
/**
 * ������ʽ
 * @author WSP
 */
public class InputCheckModelCommon {
	//ƥ��������
	 private String model = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?"
				+ "((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01"
				+ "])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0"
				+ "?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|(["
				+ "13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0"
				+ "?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1"
				+ "-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))?";
	 private String date = model+"$";
	 //ƥ�������պ�ʱ��
	 private String dateTime = model+"(\\s(((0?[0-9])|([1][0-9])|([2"
			+ "][0-4]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$";
	 //ƥ��float��int������
	 private String money = "(^[1-9]{1}[0-9]{0,}\\.[0-9]{2}$)";
	 private String ticke = "(^[1-9]{1}[0-9]+$)";
	 private String area = "(^[\u4e00-\u9fa5]+$)";
	 public String getDate() {
		return date;
	}
	public String getDateTime() {
		return dateTime;
	}
	public String getMoney() {
		return money;
	}
	public String getTicke() {
		return ticke;
	}
	public String getArea() {
		return area;
	}
}
