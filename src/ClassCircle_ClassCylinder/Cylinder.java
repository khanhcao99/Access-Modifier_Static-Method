package ClassCircle_ClassCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return super.Area()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height= " + height +
                " volume " + volume() +
                "m3" +
                '}';
    }
}
