public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(26);
        DashBoard dash1 = new DashBoard(63);

        Toyota t1 = new Toyota(2000, "1998", "544-E556", engine1, dash1);

        t1.changeFuel();
        t1.checkBattery();

        t1.model = "BMW";
        t1.company = "Toyota";
    }
}