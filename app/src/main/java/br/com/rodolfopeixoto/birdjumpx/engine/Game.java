package br.com.rodolfopeixoto.birdjumpx.engine;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import br.com.rodolfopeixoto.birdjumpx.R;
import br.com.rodolfopeixoto.birdjumpx.elements.Cano;
import br.com.rodolfopeixoto.birdjumpx.elements.Passaro;
import br.com.rodolfopeixoto.birdjumpx.graphic.Screen;

import static br.com.rodolfopeixoto.birdjumpx.R.drawable.cano;

/**
 * Created by rodolfopeixoto on 09/04/17.
 */

public class Game extends SurfaceView implements Runnable, View.OnTouchListener {
    private boolean isRuning  = true;
    private SurfaceHolder holder = getHolder();
    private Passaro passaro;
    private Cano cano;
    private Bitmap background;
    private Screen screen;

    public Game(Context context) {
        super(context);

        screen = new Screen(context);

        inicializaElementos();
        setOnTouchListener(this);
    }

    private void inicializaElementos() {

        passaro = new Passaro();
        this.cano = new Cano(screen, 200);
        Bitmap backgroundFile = BitmapFactory.decodeResource(getResources(), R.drawable.background);
        background = Bitmap.createScaledBitmap(backgroundFile, backgroundFile.getWidth(), screen.getAltura(), false);

    }

    @Override
    public void run() {
        while (isRuning){
            if(!holder.getSurface().isValid()) continue;
            Canvas canvas = holder.lockCanvas();

            canvas.drawBitmap(background, 0,0, null);
             passaro.desenhaNoCanvas(canvas);
             passaro.cai();
            cano.desenhaNo(canvas);
            cano.move();

            holder.unlockCanvasAndPost(canvas);
        }
    }

    public void inicia() {
        isRuning = true;
    }

    public void pause() {
      isRuning = false;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        passaro.pula();
        return false;
    }
}
