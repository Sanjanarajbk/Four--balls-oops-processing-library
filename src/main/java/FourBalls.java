import org.tw.Ball;
import processing.core.PApplet;

public class FourBalls extends PApplet {
    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(640,400);
    }

    @Override
    public void setup() {
        ball1 = new Ball(this,100,30,30);
        ball2 = new Ball(this,170,30,30);
        ball3 = new Ball(this,230,30,30);
        ball4 = new Ball(this,290,30,30);

    }

    @Override
    public void draw() {
        ball4.display(ball4);
        ball4.display(ball4);
        ball4.display(ball4);
        ball4.display(ball4);
        ball3.display(ball3);
        ball3.display(ball3);
        ball3.display(ball3);
        ball2.display(ball2);
        ball2.display(ball2);
        ball1.display(ball1);

    }
}
