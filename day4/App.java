public class App {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        obj1.addnumbers();
        obj1.subnumbers(50,8);
        System.out.println("Div: " + obj1.divnumbers());
        System.out.println("Mul: " + obj1.mulnumbers(5));
    }
}
