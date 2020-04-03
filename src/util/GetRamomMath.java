package util;

import java.util.Random;

import javax.xml.stream.events.StartDocument;

public class GetRamomMath {
	private GetRamomMath() {}
	 
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
