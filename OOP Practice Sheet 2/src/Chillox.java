import java.util.Scanner;

public class Chillox {
    public String BurgerName;
    public String SpicyLevel;
    public String SausageLevel;
    public double UnitPrice;

    public Chillox(String BurgerName, String SpicyLevel, String SausageLevel, double UnitPrice)
    {
        this.BurgerName = BurgerName;
        this.SpicyLevel = SpicyLevel;
        this.SausageLevel = SausageLevel;
        this.UnitPrice = UnitPrice;
    }
    public void BurgerDetails(String bName, String spicy, String sausage, double price) {
        System.out.println("BURGER DETAILS" + "\nBurger Name: " + bName + "\nSpicy Level: " + spicy + "\nSausage Level: " + sausage + "\nUnit Price: " + price);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String CustomerName = in.nextLine();
        int OrderID = in.nextInt();
        in.nextLine();
        String BurgerName = in.nextLine();
        String SpicyLevel = in.nextLine();
        String SausageLevel = in.nextLine();
        int orderQuantity = in.nextInt();
        double UnitPrice = in.nextDouble();

        Chillox obj = new Chillox(BurgerName, SpicyLevel, SausageLevel, UnitPrice);
        OrderDetails obj1 = new OrderDetails(CustomerName, OrderID, BurgerName, SpicyLevel, SausageLevel, orderQuantity);


        obj.BurgerDetails(obj.BurgerName, obj.SpicyLevel, obj.SausageLevel, obj.UnitPrice);

        obj1.displayShopName();
        obj1.OrderDetails();
        System.out.println("Total Price: " + obj1.TotalPrice(obj.UnitPrice));
    }
}

