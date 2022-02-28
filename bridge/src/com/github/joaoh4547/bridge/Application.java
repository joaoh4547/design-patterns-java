package com.github.joaoh4547.bridge;

import com.github.joaoh4547.bridge.platforms.DisneyPlus;
import com.github.joaoh4547.bridge.platforms.Facebook;
import com.github.joaoh4547.bridge.platforms.IPlatform;
import com.github.joaoh4547.bridge.platforms.TwitchTV;
import com.github.joaoh4547.bridge.platforms.Youtube;
import com.github.joaoh4547.bridge.transmissions.RecordedLive;

public class Application {
	public static void main(String[] args) {
		startLive(new Youtube());
		startLive(new TwitchTV());
		startLive(new Facebook());
		startLive(new DisneyPlus());
	}

	public static void startLive(IPlatform platform) {
		
		RecordedLive live = new RecordedLive(platform);
		live.broadcasting();
		live.record();
		live.result();
	}
}
