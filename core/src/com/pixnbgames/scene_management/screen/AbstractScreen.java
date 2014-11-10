package com.pixnbgames.scene_management.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public abstract class AbstractScreen extends Stage implements Screen {
	
	protected AbstractScreen() {
		super( new StretchViewport(320.0f, 240.0f, new OrthographicCamera()) );
	}
	
	// Subclasses must load actors in this method
	public abstract void buildStage();

	@Override
	public void render(float delta) {
		// Clear screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// Calling to Stage methods
		super.act(delta);
		super.draw();
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(this);
	}

	@Override
	public void resize(int width, int height) {
		getViewport().update(width, height);
	}

	@Override public void hide() {}
	@Override public void pause() {}
	@Override public void resume() {}
}
