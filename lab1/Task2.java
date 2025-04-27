class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock() {
        symbol = "";
        name = "";
        previousClosingPrice = 1;
        currentPrice = 1;
    }

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this();
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public void print() {
        System.out.print(symbol + " " + name + " " + previousClosingPrice + " " + currentPrice);
    }
}
public class Task2 {
    public static void main(String[] args) {

        Stock sber = new Stock("SBER", "ПАО", 281.50, 282.87);
        System.out.print("Объект: ");
        sber.print();
        System.out.println();
        System.out.print("Процент изменения: ");
        System.out.println(sber.getChangePercent());
    }
}
