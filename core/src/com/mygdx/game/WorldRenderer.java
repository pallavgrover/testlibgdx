package com.mygdx.game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

/**
 * Created by pallavgrover on 4/28/15.
 */
public class WorldRenderer implements Disposable {
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private WorldController worldController;
    public WorldRenderer (WorldController worldController) {
    }
    private void init () {
    }
    public void render () {
    }
    public void resize (int width, int height) {
    }
    @Override public void dispose () { }
}