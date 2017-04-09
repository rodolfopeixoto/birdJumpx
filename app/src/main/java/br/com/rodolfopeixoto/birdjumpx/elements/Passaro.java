package br.com.rodolfopeixoto.birdjumpx.elements;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.rodolfopeixoto.birdjumpx.graphic.Cores;

/**
 * Created by rodolfopeixoto on 09/04/17.
 */

public class Passaro {
    private static final float X = 100 ;
    private static final float RAIO = 50;
    private static final Paint VERMELHO =  Cores.getCorDoPassaro();
    private float altura;

    public Passaro() {
        this.altura = 100;
    }

    public void desenhaNoCanvas(Canvas canvas){
        canvas.drawCircle(X, altura, RAIO, VERMELHO);
    }

    public void cai() {

        this.altura += 5;

    }
}
