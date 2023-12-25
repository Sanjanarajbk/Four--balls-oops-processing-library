package org.tw;

import processing.core.PApplet;

public class Ball {
    private int xaxis=0;

    private PApplet parent; //PApplet object to get of all the other methods like ellipse from processing lib.
    private int yaxis;
    private int diameter1;
    private int diameter2;

    public Ball(PApplet parent,int yaxis, int diameter1, int diameter2) {
        this.parent=parent;
        this.yaxis = yaxis;
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
    }

    public void display(Ball ball) {
        parent.ellipse(xaxis,ball.yaxis,ball.diameter1,ball.diameter2);
        xaxis++;
    }
}
