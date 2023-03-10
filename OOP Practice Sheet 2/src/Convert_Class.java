import java.util.Scanner;

public class Convert_Class {
    int Year;
    int Age;
    int Current_Year;
    int Dolar;
    int Farenheit;

    public Convert_Class(int y, int a, int cY, int d, int f) {
        this.Year = y;
        this.Age = a;
        this.Current_Year = cY;
        this.Dolar = d;
        this.Farenheit = f;
    }

    public int convert_cencious(int f) {
        return ((f - 32) * 9) / 5;
    }

    public void Check_Leap_Year() {
        if (this.Year % 400 == 0 || (this.Year % 4 == 0 && this.Year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }

    public void Calculate_BirthYear() {
        System.out.println("Birth Year: " + (this.Current_Year - this.Age));
    }

    public double Convert_Dolar_To_Taka() {
        return this.Dolar * 80;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int a = in.nextInt();
        int cY = in.nextInt();
        int d = in.nextInt();
        int f = in.nextInt();

        Convert_Class obj = new Convert_Class(y, a, cY, d, f);

        System.out.println(obj.convert_cencious(f));
        obj.Check_Leap_Year();
        obj.Calculate_BirthYear();
        System.out.println(obj.Convert_Dolar_To_Taka());
    }
}
