package com.wsp.event.controller;

import com.wsp.event.service.impl.DoCheckAndLoadImpl;

public class CheckAndLoad {
	public CheckAndLoad() {}

	public boolean checkAndLoad(int id, String ciper, boolean isMassager) {
		DoCheckAndLoadImpl doCheckAndLoadImpl = new DoCheckAndLoadImpl();
		return doCheckAndLoadImpl.doCheckAndLoad(id, ciper, isMassager);
	}
}
