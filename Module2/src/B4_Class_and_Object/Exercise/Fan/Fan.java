package B4_Class_and_Object.Exercise.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed  = SLOW;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getBlue() {
       return "blue";
    }

    public String getColor() {
        return color;
    }

    public void Fan(){
    }
    @Override
    public String toString( ){
        if(on){
            return getSpeed() + getRadius() +" Fan is on ";
        }
        else{
           return getSpeed() + getRadius() +" Fan is off ";
        }
    }
    public static void main(String[] args){
        Fan fan1 = new Fan();
        fan1.speed = 3;
        fan1.radius = 10;
        fan1.color = "yellow";
        Fan fan2= new Fan();
        fan2.speed = 2;
        fan1.radius = 5;
        fan1.color = "blue";
        System.out.print(fan1);

    }
}
