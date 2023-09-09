import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("Enter side1 of the triangle: ");
                double side1 = input.nextDouble();

                System.out.print("Enter side2 of the triangle: ");
                double side2 = input.nextDouble();

                System.out.print("Enter side3 of the triangle: ");
                double side3 = input.nextDouble();

                input.nextLine(); // Consume the newline character

                System.out.print("Enter the color of the triangle: ");
                String color = input.nextLine();

                System.out.print("Is the triangle filled (true/false): ");
                boolean filled = input.nextBoolean();

                Triangle triangle = new Triangle(side1, side2, side3);
                triangle.setColor(color);
                triangle.setFilled(filled);

                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
                System.out.println("Description: " + triangle.toString());
            }
        }
