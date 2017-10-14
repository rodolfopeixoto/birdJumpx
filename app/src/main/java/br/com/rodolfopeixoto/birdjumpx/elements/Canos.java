package br.com.rodolfopeixoto.birdjumpx.elements;

import java.util.ArrayList;

/**
 * Created by rodolfopeixoto on 13/10/17.
 */

public class Canos {

    private final List<Cano> canos = new ArrayList<Cano>();

    public Canos(Screen screen){

        int posicao = 400;

        for(int i = 0; i < 5; i++){
            posicao += 200;
            Cano cano = new Canos(screen, posicao);
            canos.add(cano);
        }
    }
}
