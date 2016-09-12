package com.pattern._6adapter.base;

/**
 * @description Mp4Player
 * @author xudj
 * @date 2016年9月1日 下午10:01:08
 * @version 1.0
 */

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play mp4 file:" + fileName);
	}

}
