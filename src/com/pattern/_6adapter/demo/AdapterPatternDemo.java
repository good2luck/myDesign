package com.pattern._6adapter.demo;

import com.pattern._6adapter.master.AudioPlayer;

/**
 * @description AudioPlayer 来播放不同类型的音频格式
 * @author xudj
 * @date 2016年9月1日 下午10:21:10
 * @version 1.0
 */

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		//播放媒体
		audioPlayer.play("mp3", "need you now.mp3");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("avi", "mind me.avi");
		
	}
	
}
