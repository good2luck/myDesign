package com.pattern._6adapter.base;

/**
 * @description VlcPlayer
 * @author xudj
 * @date 2016年9月1日 下午9:59:33
 * @version 1.0
 */

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("play vlv file：" + fileName);
	}


	@Override
	public void playMp4(String fileName) {	}

}
