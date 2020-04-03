package util;

import bean.SMFL;

public class ForCheckAtLoad {
	private ForCheckAtLoad(){}
	public static void forCiperCheck() {
    	boolean[] b = CheckMassager.doCheckMassager(SMFL.saveCiper, SMFL.saveReCiper, SMFL.saveReCiper, 8, 16, false, SMFL.checkGoOn1);
    	SMFL.checkGoOn = b[1];
    	SMFL.checkGoOn1 = b[2];
	}
}
