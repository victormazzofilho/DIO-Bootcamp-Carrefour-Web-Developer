package ifelse.src.com.dio.base;

public class Order {

    private final String code; 
    private final double totalValue; 

    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFee(){
        if (totalValue > 100) {
            return totalValue * 0.99;
        } else {
            return totalValue;
        }
    }
}