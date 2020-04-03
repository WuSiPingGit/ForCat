package util;

import java.util.Random;
import bean.SMFL;

public class MakeCiperSafe {
    private MakeCiperSafe() {}
    /*
     * ������������,��������������2~9��������ڵ�������������0~7������������ڲ��������ڸ�����Ӧλ�ã�
     * ��һ������������ı��һ����ĸ������У����ڶ�������������������������������˫����
     *��ǰ�������������ּ�¼�������
     */
    public static String changeCiper() {
    	String newString;																		
    	final int START = 2;
    	final int END = 9;
    	final int MATH_START = 0;
    	final int MATH_END = 7;
    	byte [] b = SMFL.saveCiper.getBytes();
    	byte[] bAll = new byte[b.length+3];
    	int i = 0;
    	int length = b.length;
    	boolean hasChange = true;
    	int first = GetRamomMath.GetRamdom(START, END, true);
    	int second = GetRamomMath.GetRamdom(MATH_START, MATH_END, false);
    	int third = GetRamomMath.GetRamdom(MATH_START, MATH_END, false);
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
    		bAll[i+1] = b[i];
    	}
    	byte a = (byte)first;
    	bAll[0] = a;
    																					System.out.println(SMFL.saveCiper);
    	bAll[i+1] = (byte)second;
    	bAll[i+2] = (byte)third;
    	newString = new String(bAll);
		return newString;
	}
/*
 * �����룬��������
 */
    public static String getTrueCiper() {
    	String newString;
    	boolean bool = true;
    	byte[] b = changeCiper().getBytes();
    	byte[] bReturn = new byte[b.length-3];
    	int j = b.length-2;
    	for(int i=1;i<j;i++) {
    		if (b[i]>='A') {
				if(bool)  {
					b[i] = (byte)(b[i]-b[0]);
					bool = false;
				}
			} else {
				if (b[i]%2!=0) {
					b[i] = (byte)(b[i]-b[b.length-2]);
				} else {
					b[i]= (byte)(b[i]+b[b.length-1]);
				}
			}
    		bReturn[i-1] = b[i];
    	}
    	newString = new String(bReturn);
    	System.out.println(newString);
    	return newString;
    }
    
    /*
     * ����
     */
    public static void main(String[] args) {
    	String iString = changeCiper();
		System.out.println(changeCiper());
		byte[] b =iString.getBytes();
		System.out.println(b[0]);
		getTrueCiper();
	}
}
