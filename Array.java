public class Array
{
    public static void main(String[] args)
    {
        int arr[]= {1, 5, 3, 6}, sum = 0;

        System.out.println("\nLength of this array: " +arr.length); // To find the length of an array we use arrayName.length property.

        System.out.println("\nThis is the 3rd array element: " + arr[2]);

        System.out.println("\nThe elements of the array: " );
        for(int i =0; i < arr.length; i++) // This loop is to print the array's elements and their sum.
        {
            System.out.print(arr[i] + "\t");

            sum = sum + arr[i];
        }

        System.out.println("\n\nAnd the sum of the array's elements: " +sum + "\n\n");


        // This part is to print strings from an array of strings.
        String car[] = {"Volvo", "BMW", "Ford", "Mazda"};

        int year[] = {1960, 1966, 1985, 1996};

        System.out.println("****Famous car brands and their invention's year****");
        for(int i = 0; i < car.length; i++)
        {
            System.out.println(car[i] + ": " + year[i]);
        }
    }
}
