package forit.src.com.dio.base;

public class Order {

    private final String code; 
    private final double totalValue;
    
    private String[] items;

    public Order(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    public void PrintItems(){    
        for (int i = 0; 1 < items.length; i++){
            System.out.println(items[i]);
        }        
    }
}