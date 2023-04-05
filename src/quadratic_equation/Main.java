package quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QuadraticEquation: ax2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        if(equation1.getDiscriminant() < 0){
            System.out.println("The equation has no roots");
        } else if (equation1.getDiscriminant() == 0) {
            System.out.println("Equation has 1 root: " + equation1.getRoot1());
        }else {
            System.out.printf("Equation has 2 roots: %f and %f", equation1.getRoot1(), equation1.getRoot2());
        }
    }
}
