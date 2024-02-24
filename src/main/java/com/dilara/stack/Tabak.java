package com.dilara.stack;

public class Tabak {
    private int id;
    private boolean kirliMi;

    public Tabak() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isKirliMi() {
        return kirliMi;
    }

    public void setKirliMi(boolean kirliMi) {
        this.kirliMi = kirliMi;
    }

    public Tabak(int id, boolean kirliMi) {
        this.id = id;
        this.kirliMi = kirliMi;
    }
}
