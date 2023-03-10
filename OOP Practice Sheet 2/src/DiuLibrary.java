import java.util.Scanner;

public class DiuLibrary {
    public int LibraryID;
    public String BookName;
    private String Bookauthor;
    String BookType;
    public String PublishedDate;

    public DiuLibrary(int id, String bName, String bAuthor, String bType, String pDate) {
        this.LibraryID = id;
        this.BookName = bName;
        this.Bookauthor = bAuthor;
        this.BookType = bType;
        this.PublishedDate = pDate;
    }

    public String LibraryName() {
        return "DIU Library";
    }

    public String BookDetails(String author, String Type) {
        return author + " " + Type;
    }

//    public String BookDetails(String bookName, String publichedDate) {
//        return "Book Author: " + bookName + "Book Type: " + publichedDate;
//    }

    public String BrowedBook(int ID, String Name) {
        return ID + " " + Name;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        in.nextLine();   // After int take input then the next string will not work. So this line has to write.
        String bName = in.nextLine();
        String bAuthor = in.nextLine();
        String bType = in.nextLine();
        String pDate = in.nextLine();

        DiuLibrary obj = new DiuLibrary(id, bName, bAuthor, bType, pDate);

        System.out.println(obj.LibraryName());
        System.out.println(obj.BookDetails(bAuthor, bType));
        //System.out.println(obj.BookDetails(bName, pDate));
        System.out.println(obj.BrowedBook(id, bName));
    }

}