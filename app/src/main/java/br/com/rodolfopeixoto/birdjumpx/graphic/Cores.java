package br.com.rodolfopeixoto.birdjumpx.graphic;

import android.graphics.Paint;

/**
 * Created by rodolfopeixoto on 09/04/17.
 */

public class Cores {
    public static Paint getCorDoPassaro() {

        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        return paint;
    }

    public static Paint getCorDoCano() {
        Paint verde = new Paint();
        verde.setColor(0xFF00FF00);
        return verde;
    }
}
