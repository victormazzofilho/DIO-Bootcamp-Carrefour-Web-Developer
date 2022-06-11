package swithcase.src.com.dio.base;

public class Order {

    private final String code; 
    private final double totalValue; 

    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public double calculateFee(){
        switch (totalValue) {
            case 100.0:
                return totalValue * 0.99;
            case 200.0:
                return totalValue * 1.99;
            default:
                return totalValue;
        }
    }
}