package Access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.printf("Nhập vào bán kình hình tròn: ");
        circle.setRadius(input.nextDouble());
        circle.display();
    }
}
