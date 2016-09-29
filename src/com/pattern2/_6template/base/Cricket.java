package com.pattern2._6template.base;

/**
 * 打板球游戏
 * @author newuser
 */
public class Cricket extends Game {

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

}
