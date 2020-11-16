package B6_inheritance.Exercise;

public class Point_2D_3D {
    private float x = 0.0f;
    private float y = 0.0f;

    //Constructor
    public Point_2D_3D(){};
    public Point_2D_3D(float x,float y){
        this.x = x;
        this.y = y;
    }

    //Getter setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] toado = new float[2];
        toado[0] = x;
        toado[1] = y;
        return toado;
    }
    @Override
    public String toString(){
        return x+ ", "+y;
    }
}
