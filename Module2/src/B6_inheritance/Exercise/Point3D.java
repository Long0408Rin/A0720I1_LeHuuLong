package B6_inheritance.Exercise;

import java.util.Arrays;

public class Point3D extends Point_2D_3D {
    private float z = 0.0f;

    //constructor
    Point3D() {
    }

    Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    //getter va setter
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] toado = new float[3];
        toado[0] = super.getX();
        toado[1] = super.getY();
        toado[2] = z;
        return toado;
    }

    @Override
    public String toString() {
        return "Point 3D has: " +Arrays.toString(getXYZ());
    }
}
