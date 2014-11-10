package com.pixnbgames.scene_management.util;

import com.pixnbgames.scene_management.screen.AbstractScreen;
import com.pixnbgames.scene_management.screen.GameScreen;
import com.pixnbgames.scene_management.screen.LevelSelectScreen;
import com.pixnbgames.scene_management.screen.MainMenuScreen;

public enum ScreenEnum {
	
	MAIN_MENU {
		public AbstractScreen getScreen(Object... params) {
			return new MainMenuScreen();
		}
	},
	
	LEVEL_SELECT {
		public AbstractScreen getScreen(Object... params) {
			return new LevelSelectScreen();
		}
	},
	
	GAME {
		public AbstractScreen getScreen(Object... params) {
			return new GameScreen((Integer) params[0]);
		}
	};
	
	public abstract AbstractScreen getScreen(Object... params);
}
