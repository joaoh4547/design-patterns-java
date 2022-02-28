package com.github.joaoh4547.bridge.transmissions;

import com.github.joaoh4547.bridge.platforms.IPlatform;

public class RecordedLive extends Live {
	
	public RecordedLive(IPlatform platform) {
		super(platform);
	}
	
	public void record() {
		System.out.println("Iniciando Gravação...");
	}
}
