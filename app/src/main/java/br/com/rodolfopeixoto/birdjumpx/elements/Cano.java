package br.com.rodolfopeixoto.birdjumpx.elements;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.rodolfopeixoto.birdjumpx.graphic.Cores;
import br.com.rodolfopeixoto.birdjumpx.graphic.Screen;

/**
 * Created by rodolfopeixoto on 13/10/17.
 */

public class Cano {

    private Screen screen;
    private int alturaDoCanoInferior;
    private static final int LARGURA_DO_CANO = 100;
    private static final int TAMANHO_DO_CANO = 250;
    private static final Paint COLOR = Cores.getCorDoCano() ;
    private int posicao;

    public Cano(Screen screen, int posicao){
        this.screen = screen;
        this.posicao = posicao;
        alturaDoCanoInferior = screen.getAltura() - TAMANHO_DO_CANO;
    }

    public void desenhaNo(Canvas canvas){
        desenhaCanoInferior(canvas);
    }

    private void desenhaCanoInferior(Canvas canvas){
        canvas.drawRect(posicao, alturaDoCanoInferior, posicao + LARGURA_DO_CANO, screen.getAltura(), COLOR);
    }

    public void move() {
        this.posicao -= 5;
    }
}
