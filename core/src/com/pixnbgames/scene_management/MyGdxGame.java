package com.pixnbgames.scene_management;

import com.badlogic.gdx.Game;
import com.pixnbgames.scene_management.util.ScreenEnum;
import com.pixnbgames.scene_management.util.ScreenManager;

public class MyGdxGame extends Game {
	
	@Override
	public void create () {
		ScreenManager.getInstance().initialize(this);
		ScreenManager.getInstance().showScreen( ScreenEnum.MAIN_MENU );
	}
}
