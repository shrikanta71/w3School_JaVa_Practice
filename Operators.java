public class Operators
{
    public static void main(String[] args)
    {
        int number1 = 5, number2 = 10;

        System.out.println("The sum of two number: " + (number1 + number2));
        System.out.println("The Subtraction of two number: " + (number2 - number1));
        System.out.println("The product of two number: " + (number1 * number2));
        System.out.println("The division of two number: " + (number2 / number1));
        System.out.println("The modulus of two number: " + (number2 % number1));

        System.out.println("\n" + (number1 > number2 || number1 < number2 || number1 == number2)); // Boolean Expression.
    }
}
