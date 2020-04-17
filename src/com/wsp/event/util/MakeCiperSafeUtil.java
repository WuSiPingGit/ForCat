package com.wsp.event.util;

/**
 * 加密数据和解密数据
 * @author WSP
 * @Date 2020年4月5日
 */
public class MakeCiperSafeUtil {
    public MakeCiperSafeUtil() {}
    /*
     * 加密密码数据,获得随机数，并把2~9随机数放在倒数第三和俩个0~7随机单数数放在并把它放在该数对应位置，
     * 第一个随机数用来改变第一个字母（如果有），第二个用来加密其他单数，第三个加密双数；
     *最前和最后的俩个数字记录随机数；
     */
    /**
     * 密码
     * @param saveCiper
     * 加密后的密码
     * @return
     */
    public String changeCiper(String saveCiper) {
    	String newString;																		
    	final int START = 2;
    	final int END = 9;
    	final int MATH_START = 0;
    	final int MATH_END = 7;
    	byte [] b = saveCiper.getBytes();
    	int i = 0;
    	int length = b.length;
    	boolean hasChange = true;
    	int first = GetRamomMathUtil.GetRamdom(START, END, true);
    	int second = GetRamomMathUtil.GetRamdom(MATH_START, MATH_END, false);
    	int third = GetRamomMathUtil.GetRamdom(MATH_START, MATH_END, false);
    	for(;i<length;i++) {
    		if ((b[i]>='a'&&b[i]<='z')||(b[i]>='A'&&b[i]<='Z')) {
				if(hasChange) {
					b[i] = (byte)(b[i]+first);
					hasChange = false;
				}
			} else {
				if (((int)b[i]%2)==0) {
					b[i] = (byte)(b[i]+second);
				} else {
					b[i] = (byte)(b[i]-third);
				}
			}
    	}
    	newString = new String(b);
    	newString = first+newString+third+second;	
		return newString;
	}
/**
 * 加密后的密码
 * @param changeCiper
 * 密码
 * @return
 */
    public String getTrueCiper(String changeCiper) {
    	String newString;
    	boolean bool = true;
    	byte[] b = changeCiper.getBytes();
    	char[] stringChar = new char[changeCiper.length()-3];
    	int j = b.length-2;
    	int i=1;
    	for(;i<j;i++) {
    		if (b[i]>='A') {
				if(bool)  {
					b[i] = (byte)(b[i]-b[0]+48);
					bool = false;
				}
			} else {
				if (b[i]%2!=0) {
					b[i] = (byte)(b[i]-b[b.length-1]+48);
				} else {
					b[i]= (byte)(b[i]+b[b.length-2]-48);
				}
			}
    		stringChar[i-1] =(char)b[i];
    	}
    	newString = new String(stringChar);
    	return newString;
    }
    
    
/*
    public static void main(String[] args) {
		MakeCiperSafeUtil mk = new MakeCiperSafeUtil();
		System.out.println(mk.changeCiper("lihua2345"));	
		System.out.println(mk.getTrueCiper("6.6]35a2b0033"));
	}
*/
    
}
