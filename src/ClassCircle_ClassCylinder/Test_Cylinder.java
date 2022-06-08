package ClassCircle_ClassCylinder;

import java.util.Scanner;

public class Test_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào chiều cao của hình trụ: ");
        double a = input.nextDouble();
        Cylinder cylinder = new Cylinder(a);
        System.out.printf("Nhập vào bán kính hình tròn: ");
        double b = input.nextDouble();
        cylinder.setRadius(b);
        System.out.println(cylinder);
    }
}
