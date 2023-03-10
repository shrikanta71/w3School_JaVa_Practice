import java.util.Scanner;
public class MovieClass
{
    public String Avatar_DirectorName;
    public String Hobbit_DirectorName;
    public String Lord_of_The_Ring_DirectorName;
    public int Avatar_Rating;
    public int Hobbit_Rating;
    public int Lord_of_The_Ring_Rating;
    public int Release_Year_Avatar;
    public int Release_Yea_Hobbit;
    public int Release_Yea_Lord_of_The_Ring;

    public MovieClass(String adn, String hdn, String lotrdn, int ar, int hr, int lotrr, int rya, int ryh, int rylotr)
    {
        this.Avatar_DirectorName = adn;
        this.Hobbit_DirectorName = hdn;
        this.Lord_of_The_Ring_DirectorName = lotrdn;
        this.Avatar_Rating = ar;
        this.Hobbit_Rating = hr;
        this.Lord_of_The_Ring_Rating = lotrr;
        this.Release_Year_Avatar = rya;
        this.Release_Yea_Hobbit = ryh;
        this.Release_Yea_Lord_of_The_Ring = rylotr;
    }
    public void Movi_Information(int ar, int hr, int lotrr)
    {
        System.out.println("A:" + ar + " H:" + hr + " LOTR:" + lotrr);
    }

    public void Movi_Reales_Year(int rya, int ryh, int rylotr)
    {
        System.out.println("A:" + rya + " H:" + ryh + " LOTR:" + rylotr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String adn = in.nextLine();
        String hdn = in.nextLine();
        String lotrdn = in.nextLine();
        int ar = in.nextInt();
        int hr = in.nextInt();
        int lotrr = in.nextInt();
        int rya = in.nextInt();
        int ryh = in.nextInt();
        int rylotr = in.nextInt();

        MovieClass obj = new MovieClass(adn, hdn, lotrdn, ar, hr, lotrr, rya, ryh, rylotr);

        obj.Movi_Information(ar, hr, lotrr);
        obj.Movi_Reales_Year(rya, ryh, rylotr);
    }

}
