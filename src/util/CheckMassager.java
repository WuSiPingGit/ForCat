package util;

import org.omg.CORBA.FloatSeqHelper;
/*
 * 进行数据检查的俩种方法
 */


public class CheckMassager {
	private CheckMassager() {}
	
	public static boolean doCheckMassager(String doCheck, String model, int start, int end, boolean tureIsEqualsAndFalseMatches) {
		boolean bool = false;
		if(doCheck.length()>=start&&doCheck.length()<=end) {
			if(tureIsEqualsAndFalseMatches) {
				if(doCheck.matches(model))
					bool = true;
			} else
				if(doCheck.equals(model))
					bool = true;
		}
		return bool;
	}
	
	public static boolean[] doCheckMassager(String doCheck, String model, String reDoCheck, int start, int end, boolean tureIsEqualsAndFalseMatches, boolean inbool) {
		boolean[] bool = new boolean[2];
		bool[0] = inbool;
		bool[1] = false;
		if(doCheck.length()>=start&&doCheck.length()<=end) {
			if(tureIsEqualsAndFalseMatches) {
				if(doCheck.matches(model))
					bool[1] = true;
			} else
				if(doCheck.equals(model))
					bool[1] = true;
		}
		if (bool[1])
			if (inbool) {
				if (reDoCheck.equals(doCheck)) {
					bool[0] = true;
				}
			};
		return bool;
	}

}
