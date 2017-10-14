package br.com.rodolfopeixoto.birdjumpx.graphic;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class Screen {
    private DisplayMetrics metrics;

    public Screen(Context context) {
        WindowManager  windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();

        metrics = new DisplayMetrics();

        display.getMetrics(metrics);
    }

    public int getAltura(){
        return metrics.heightPixels;
    }
}
