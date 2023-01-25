public class If_else_switch
{
    public static void main(String[] args)
    {

        // For day wishing time.
        int time = 22;

        if (time < 10)
        {
            System.out.println("Good morning.");
        }

        else if (time < 18)
        {
            System.out.println("Good day.");
        }

        else
        {
            System.out.println("Good evening.");
        }

        System.out.println("\n\n");

        // Switch_case to find the day.
        int day = 4;

        switch (day)
        {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default :
                System.out.println("Invalid day");

        }
    }
}
