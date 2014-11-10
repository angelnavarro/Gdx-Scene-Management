package com.pixnbgames.scene_management.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.pixnbgames.scene_management.util.ScreenEnum;
import com.pixnbgames.scene_management.util.UIFactory;

public class LevelSelectScreen extends AbstractScreen {
	
	private Texture txtrBg;
	private Texture txtrBack;
	private Texture txtrLevel1;
	private Texture txtrLevel2;
	
	public LevelSelectScreen() {
		super();
		txtrBg   = new Texture( Gdx.files.internal("img/level_select_bg.png") );
		txtrBack = new Texture( Gdx.files.internal("img/btn_back.png") );
		txtrLevel1 = new Texture( Gdx.files.internal("img/btn_level_1.png") );
		txtrLevel2 = new Texture( Gdx.files.internal("img/btn_level_2.png") );
	}

	@Override
	public void buildStage() {
		
		// Adding actors
		Image bg = new Image(txtrBg);
		addActor(bg);
		
		ImageButton btnBack = UIFactory.createButton(txtrBack);
		btnBack.setPosition(260.f, 40.f, Align.center);
		addActor(btnBack);
		
		ImageButton btnLevel1 = UIFactory.createButton(txtrLevel1);
		btnLevel1.setPosition(100.f, 100.f, Align.center);
		addActor(btnLevel1);
		
		ImageButton btnLevel2 = UIFactory.createButton(txtrLevel2);
		btnLevel2.setPosition(220.f, 100.f, Align.center);
		addActor(btnLevel2);
		
		btnBack.addListener( UIFactory.createListener( ScreenEnum.MAIN_MENU ) );
		btnLevel1.addListener( UIFactory.createListener(ScreenEnum.GAME, 1) );
		btnLevel2.addListener( UIFactory.createListener(ScreenEnum.GAME, 2) );
	}

	@Override
	public void dispose() {
		super.dispose();
		txtrBg.dispose();
		txtrBack.dispose();
		txtrLevel1.dispose();
		txtrLevel2.dispose();
	}
}
