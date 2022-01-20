public class Ball {
    int xCoordinate, yCoordinate, speed;
    int diameter =10;
    BallsSketch sketch;

    Ball(int xCoordinate, int yCoordinate, int speed, BallsSketch sketch){
        this.xCoordinate =xCoordinate;
        this.yCoordinate =yCoordinate;
        this.speed =speed;
        this.sketch =sketch;
    }
    public void ballSketch(){
        sketch.ellipse(xCoordinate, yCoordinate, diameter, diameter);
    }
    public void setBallPath(){
        xCoordinate = xCoordinate + speed;
    }
}
