package com.client.giorgoch.client;

public class MyPojo {
    private Draw draw;

    public Draw getDraw() {
        return draw;
    }

    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    @Override
    public String toString() {
        return "ClassPojo [draw = " + draw + "]";
    }
}
