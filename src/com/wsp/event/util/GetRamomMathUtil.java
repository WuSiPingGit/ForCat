package com.wsp.event.util;

import java.util.Random;

import javax.xml.stream.events.StartDocument;
/**
 * 
 * 获取随机数用来加密数据
 */
public class GetRamomMathUtil {
	private GetRamomMathUtil() {}
	/**
	 * 最少数
	 * @param start
	 * 最大数
	 * @param end
	 * 是否为双数
	 * @param canDoubleMath
	 * 返回随机数
	 * @return
	 */
	public static int  GetRamdom(int start, int end, boolean canDoubleMath) {
		Random r =new Random(System.currentTimeMillis());
		int checkReturn = -1;
		if (canDoubleMath)
			while(checkReturn<start)
			    checkReturn = r.nextInt(end);
		else
			while(true) {
		        checkReturn = r.nextInt(end);
		        	if (checkReturn%2!=0&&checkReturn>=start)
		        		break;
			}
		return checkReturn;
	}
}
