package com.domain.dungeon.engine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.graphics.Canvas;
import android.graphics.Bitmap;

import com.domain.dungeon.R;
import com.domain.dungeon.map.Map;
import com.domain.dungeon.map.Tile;

import android.util.Log;

import java.util.ArrayList;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
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

        Map map = new Map(9, 9);


        Tile.bindResources(this);

        int w, h;
        for (ArrayList<Tile> row : map.tiles) {
            for (Tile tile : row) {
                Bitmap bitmap = tile.getBitmap();
                w = tile.w * 200;
                h = tile.h * 200;
                canvas.drawBitmap(bitmap, w, h, null);
            }
        }

        holder.unlockCanvasAndPost(canvas);

    }

    public void surfaceDestroyed(SurfaceHolder holder) {
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
    }

}
