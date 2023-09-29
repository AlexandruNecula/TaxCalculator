public class Main {
    public static void main(String[] args) {

        valuesClass values = new valuesClass();
        values.price=16;
        values.tax=2;
        values.quantity=8;
        String message = "I want to buy " + values.quantity + " shirt!";
        System.out.println(message);
        values.total = values.price * values.quantity * values.tax;
        System.out.println("Total cost with tax is = " + values.total);
    }
}