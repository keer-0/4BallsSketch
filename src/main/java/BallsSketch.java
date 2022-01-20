import processing.core.PApplet;

public class BallsSketch extends PApplet{
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int TOTAL_PORTIONS = 5;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    public static void main(String args[]) {
       PApplet.main("BallsSketch",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        ball1=new Ball(0,HEIGHT/ TOTAL_PORTIONS,1,this);
        ball2=new Ball(0,2*HEIGHT/TOTAL_PORTIONS,2,this);
        ball3=new Ball(0,3*HEIGHT/TOTAL_PORTIONS,3,this);
        ball4=new Ball(0,4*HEIGHT/TOTAL_PORTIONS,4,this);
    }

    @Override
    public void draw() {
        ball1.ballSketch();
        ball1.setBallPath();
        ball2.ballSketch();
        ball2.setBallPath();
        ball3.ballSketch();
        ball3.setBallPath();
        ball4.ballSketch();
        ball4.setBallPath();
    }


}
