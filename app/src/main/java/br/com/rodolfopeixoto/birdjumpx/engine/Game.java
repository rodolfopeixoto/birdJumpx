package br.com.rodolfopeixoto.birdjumpx.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import br.com.rodolfopeixoto.birdjumpx.elements.Passaro;

/**
 * Created by rodolfopeixoto on 09/04/17.
 */

public class Game extends SurfaceView implements Runnable{
    private boolean isRuning  = true;
    private SurfaceHolder holder = getHolder();
    private Passaro passaro;

    public Game(Context context) {
        super(context);

        inicializaElementos();
    }

    private void inicializaElementos() {

        passaro = new Passaro();

    }

    @Override
    public void run() {
        while (isRuning){
            if(!holder.getSurface().isValid()) continue;
            Canvas canvas = holder.lockCanvas();

             passaro.desenhaNoCanvas(canvas);
             passaro.cai();

            holder.unlockCanvasAndPost(canvas);
        }
    }

    public void inicia() {
        isRuning = true;
    }

    public void pause() {
      isRuning = false;
    }
}
