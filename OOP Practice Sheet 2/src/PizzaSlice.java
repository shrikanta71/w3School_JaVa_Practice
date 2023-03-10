import java.util.Scanner;

public class PizzaSlice {
    public double Angle1;
    private double Angle2;
    int Angle3;
    public double Height;
    public double Base;

    public PizzaSlice(double a1, double a2, int a3, double h, double b) {
        this.Angle1 = a1;
        this.Angle2 = a2;
        this.Angle3 = a3;
        this.Height = h;
        this.Base = b;
    }

    public void ShapeName() {
        if ((this.Angle1 + this.Angle2 + this.Angle3) == 180) {
            System.out.println("Triangle");
        } else {
            System.out.println("Not Triangle");
        }
    }

    public double Area(double a, double b) {
        return 0.5 * a * b;
    }

    public void CheckTriangle() {
        if ((this.Angle1 + this.Angle2 + this.Angle3) == 180) {
            if (this.Angle1 == 90 || this.Angle2 == 90 || this.Angle3 == 90) {
                System.out.println("Right angled triangle");
            } else if (this.Angle1 < 90 && this.Angle2 < 90 && this.Angle3 < 90) {
                System.out.println("Acute triangle");
            } else {
                System.out.println("Obtuse Triangle");
            }
        }
    }

    public void CheckRightAngleTriagle() {
        if ((this.Angle1 + this.Angle2 + this.Angle3) == 180) {
            if (this.Angle1 == 90 || this.Angle2 == 90 || this.Angle3 == 90) {
                System.out.println("Yes, Right angled triangle");
            }
            else {
                System.out.println("Not Right angled triangle");
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a1 = in.nextDouble();
        double a2 = in.nextDouble();
        int a3 = in.nextInt();
        double h = in.nextDouble();
        double b = in.nextDouble();

        PizzaSlice obj = new PizzaSlice(a1, a2, a3, h, b);

        obj.ShapeName();
        System.out.println(obj.Area(h, b));
        obj.CheckTriangle();
        obj.CheckRightAngleTriagle();
    }
}
