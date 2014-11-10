package com.pixnbgames.scene_management.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.pixnbgames.scene_management.util.ScreenEnum;
import com.pixnbgames.scene_management.util.UIFactory;

public class GameScreen extends AbstractScreen {
	
	private Texture txtrBg;
	private Texture txtrBack;
	private Texture txtrLevelImage;
	
	// Current level
	private int level;
	
	public GameScreen(Integer level) {
		super();
		this.level = level.intValue();
		txtrBg   = new Texture( Gdx.files.internal("img/game_bg.png") );
		txtrBack = new Texture( Gdx.files.internal("img/btn_back.png") );
	}

	@Override
	public void buildStage() {
		// Adding actors
		Image bg = new Image(txtrBg);
		addActor(bg);
		
		ImageButton btnBack = UIFactory.createButton(txtrBack);
		btnBack.setPosition(260.f, 40.f, Align.center);
		addActor(btnBack);
		
		txtrLevelImage = new Texture( Gdx.files.internal("img/btn_level_" + level + ".png") );
		Image imgLevel = new Image(txtrLevelImage);
		imgLevel.setPosition(getWidth() / 2, getHeight() / 2, Align.center);
		addActor(imgLevel);
		
		btnBack.addListener( UIFactory.createListener( ScreenEnum.LEVEL_SELECT ) );
	}

	@Override
	public void dispose() {
		super.dispose();
		txtrBg.dispose();
		txtrBack.dispose();
		txtrLevelImage.dispose();
	}

}
