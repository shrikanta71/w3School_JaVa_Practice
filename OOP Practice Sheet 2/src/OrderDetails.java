public class OrderDetails
{
    public String CustomerName;
    public int OrderID;
    public String BurgerName;
    public String SpicyLevel;
    public String SausageLevel;
    public int orderQuantity;

    public OrderDetails(String CustomerName, int OrderID, String BurgerName, String SpicyLevel, String SausageLevel, int orderQuantity)
    {
        this.CustomerName = CustomerName;
        this.OrderID = OrderID;
        this.BurgerName = BurgerName;
        this.SpicyLevel = SpicyLevel;
        this.SausageLevel =SausageLevel;
        this.orderQuantity = orderQuantity;
    }

    public void displayShopName()
    {
        System.out.println("\nChillox");
    }

    public void OrderDetails()
    {
        System.out.println("Customer Name: " + CustomerName + "\nOrder ID: " + OrderID + "\nBurger Name: " + BurgerName + "\nSpicy Level: " + SpicyLevel + "\nSausage Level: " + SausageLevel + "\nOrder Quantity: " + orderQuantity);
    }

    public double TotalPrice(double UnitPrice)
    {
        return UnitPrice;
    }
}
