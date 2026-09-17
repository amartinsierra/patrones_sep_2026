package com.cursopatrones.proxy.client;

import com.cursopatrones.proxy.interfaz.MissileSystem;
import com.cursopatrones.proxy.proxy.MissileProxy;

public class Demo {

	public static void main(String[] args) {
		String code="ABC";
		MissileSystem missileProxy = new MissileProxy(code);
		missileProxy.launch();


	}

}
