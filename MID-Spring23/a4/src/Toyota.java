public class Toyota extends Car {
    double price;
    String productionYear;
    String registrationNumber;
    Engine en;
    DashBoard db;

    public void changeFuel() {
        System.out.println("Change the fuel");
    }

    public void checkBattery() {
        System.out.println("Check the Battery");
    }

    public Toyota(double price, String productionYear, String registrationNumber, Engine en, DashBoard bd) {
        this.price = price;
        this.productionYear = productionYear;
        this.registrationNumber = registrationNumber;
        this.en = en;
        this.db = bd;
    }
}

