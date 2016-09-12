package com.pattern._6adapter.master;

/**
 * @description 媒体播放器
 * @author xudj
 * @date 2016年9月1日 下午10:15:40
 * @version 1.0
 */

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;	//播放适配器
	
	@Override
	public void play(String audioType, String fileName) {
		
		if("mp3".equals(audioType)){	//内置mp3播放器
			System.out.println("mp3 play fileName：" + fileName);
		} else if("mp4".equals(audioType) || "vlc".equals(audioType)){		//mediaAdapter 提供了播放其他文件格式的支持
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			 System.out.println("Invalid media. "+
			            audioType + " format not supported");
		}
		
	}

}
