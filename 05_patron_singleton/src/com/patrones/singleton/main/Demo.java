package com.patrones.singleton.main;

import com.patrones.singleton.service.LoggerSingleton;
import com.patrones.singleton.service.LoggerSingletonModern;

public class Demo {

	public static void main(String[] args) {
		var l1=LoggerSingleton.getInstance();
		var l2=LoggerSingleton.getInstance();
		System.out.println(l1==l2);
		
		var ln1=LoggerSingletonModern.INSTANCE;
		var ln2=LoggerSingletonModern.INSTANCE;
		System.out.println(ln1==ln2);

	}

}
