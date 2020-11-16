package B6_inheritance.Triagle_Class;

public class Shape {
    String color;
     public Shape(){}
     public Shape(String color){
         this.color = color;
     }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
         return "Shape color is: "+ color;
    }
}
