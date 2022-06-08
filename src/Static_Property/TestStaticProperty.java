package Static_Property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("Marda","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car1 = new Car("Honda", "DongCo 2");
        System.out.println(Car.numberOfCars);
    }
}
