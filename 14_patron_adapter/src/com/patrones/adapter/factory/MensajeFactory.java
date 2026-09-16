package com.patrones.adapter.factory;

import com.patrones.adapter.legacy.Info;
import com.patrones.adapter.target.Adapter;
import com.patrones.adapter.target.Mensaje;

public class MensajeFactory {
	
		public static Mensaje crear() {
			return new Adapter(new Info());
		}


}
