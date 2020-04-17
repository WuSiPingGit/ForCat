package com.wsp.event.util;

import org.omg.CORBA.FloatSeqHelper;
/**
 * �������ݼ�顢У��
 * @author WSP
 */
public class CheckMassagerUtil {
	private CheckMassagerUtil() {}
	/*
	 * ��������У��
	 */
	public static boolean doCheckMassager(String doCheck, String model, int start, int end, boolean tureIsEqualsAndFalseMatches) {
		boolean bool = false;
		if(doCheck.length()>=start&&doCheck.length()<=end) {
			if(tureIsEqualsAndFalseMatches) {
				if(doCheck.equals(model))
					bool = true;
			} else
				if(doCheck.matches(model))
					bool = true;
			System.out.println(bool);
		}
		return bool;
	}
	/*
	 * ��������У��
	 */
	public static boolean[] doCheckMassager(String doCheck, String model, String reDoCheck, int start, int end, boolean tureIsEqualsAndFalseMatches) {
		boolean[] bool = new boolean[2];
		bool[0] = false;
		bool[1] = false;
		if(doCheck.length()>=start&&doCheck.length()<=end) {
			if(tureIsEqualsAndFalseMatches) {
				if(doCheck.equals(model))
					bool[1] = true;
			} else
				if(doCheck.matches(model))
					bool[1] = true;
		}
		if (bool[1]){
				if (reDoCheck.equals(doCheck)) {
					bool[0] = true;
				}
			}
		return bool;
	}

}
