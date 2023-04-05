package quadratic_equation;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1(){
        if(getDiscriminant() >= 0){
            return (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 / this.a;
        }else {
            return 0;
        }
    }

    public double getRoot2(){
        if(getDiscriminant() >= 0){
            return (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 / this.a;
        }else {
            return 0;
        }
    }
}
