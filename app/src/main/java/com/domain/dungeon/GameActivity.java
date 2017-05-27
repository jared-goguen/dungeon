package com.domain.dungeon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.graphics.Canvas;

import com.domain.dungeon.engine.Camera;
import com.domain.dungeon.engine.Game;
import com.domain.dungeon.map.Area;


public class GameActivity extends AppCompatActivity implements SurfaceHolder.Callback {

    SurfaceView surfaceView;
    SurfaceHolder surfaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game);

        surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);

    }

    public void surfaceCreated(SurfaceHolder holder) {
        Canvas canvas = holder.lockCanvas(null);

        Game game = new Game();
        Area area = game.getArea();
        Camera camera = new Camera(area);
        camera.draw(canvas);

        holder.unlockCanvasAndPost(canvas);

    }

    public void surfaceDestroyed(SurfaceHolder holder) {
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
    }

}
