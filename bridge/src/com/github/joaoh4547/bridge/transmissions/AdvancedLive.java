package com.github.joaoh4547.bridge.transmissions;

import com.github.joaoh4547.bridge.platforms.IPlatform;

public class AdvancedLive extends Live{
	
	public AdvancedLive(IPlatform platform) {
		super(platform);
	}
	
	public void subtitles() {
		System.out.println("Legendas ativadas");
	}
	
	public void comments() {
		System.out.println("Comentarios liberados");
	}
}
