package model;

import java.io.Serializable;

public class LiberarUrnaTerminal implements Serializable {

    private boolean liberar;
    public boolean getLiberar() {
        return liberar;
    }

    public void setLiberar(boolean liberar) {
        this.liberar = liberar;
    }
}
