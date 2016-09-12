package com.pattern._6adapter.master;

import com.pattern._6adapter.base.AdvancedMediaPlayer;
import com.pattern._6adapter.base.Mp4Player;
import com.pattern._6adapter.base.VlcPlayer;

/**
 * @description MediaAdapter接口适配器
 * @author xudj
 * @date 2016年9月1日 下午10:06:23
 * @version 1.0
 */
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;	//高级播放器
	

	public MediaAdapter(String audioType) {
		if("vlc".equals(audioType)){
			advancedMediaPlayer = new VlcPlayer(); 
		}else if("mp4".equals(audioType)){
			advancedMediaPlayer = new Mp4Player();
		}
	}


	@Override
	public void play(String audioType, String fileName) {
		if("vlc".equals(audioType)){
			advancedMediaPlayer.playVlc(fileName);
		} else if("mp4".equals(audioType)){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
