package B6_inheritance.Point_MoveablePoint;

public class MovablePoint extends Point{
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    // Constructor
    public MovablePoint(){}
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = xSpeed; // float[] result = {getxSpeed;getySpeed }
        result[1] = ySpeed;
        return result;
    }
    @Override
    public String toString(){
       return "(x,y)" + super.getX() + " " + getY()
               +" speed " + getxSpeed() + " "+getySpeed();
    }
    public MovablePoint Move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
