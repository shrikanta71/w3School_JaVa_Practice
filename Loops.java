public class Loops
{
    public static void main(String[] args)
    {
        String name = "Shrikanta Paul";

        // Print a string 5 times using 'for loop'.
        System.out.println("***Print a string 5 times using 'for loop'***");
        for(int i = 1; i<5; i++)
        {
            System.out.print(name + ", ");
        }

        System.out.println(name + ".");


        // Print a string 5 time using 'while loop'.
        System.out.println("\n\n***Print a string 5 times using 'while loop'***");
        int j = 1;

        while(j<5)
        {
            System.out.print(name + ", ");
            j++;
        }

        System.out.println(name + ".");


        // Print a string 5 time using 'do...while loop'.
        System.out.println("\n\n***Print a string 5 times using 'do...while loop'***");

        int k =1;

        do{
            System.out.print(name + ", ");
            k++;
        }while(k<5);

        System.out.println(name + ".");
    }
}
