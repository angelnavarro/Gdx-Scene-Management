package com.pixnbgames.scene_management.util;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class UIFactory {
	
	public static ImageButton createButton(Texture texture) {
		return
				new ImageButton(
						new TextureRegionDrawable(
								new TextureRegion(texture) ) );
	}
	
	public static InputListener createListener(final ScreenEnum dstScreen, final Object... params) {
		return 
				new InputListener() {
					@Override
					public boolean touchDown(InputEvent event, float x,
							float y, int pointer, int button) {
						ScreenManager.getInstance().showScreen(dstScreen, params);
						return false;
					}
				};
	}
}
