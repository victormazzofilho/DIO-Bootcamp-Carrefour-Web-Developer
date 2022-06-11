package ifelse.src.com.dio;

import ifelse.src.com.dio.base.Order;

public class MyFirstProgram{

    public static void main (String[] args) {
        final Order order = new Order ("code1234" , 99.99);
        System.out.println(order);
    }
}