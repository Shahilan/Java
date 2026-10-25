class Laptop{
    String brand;
    String model;
    double price;
    public static void main(String[] arg){
         Laptop Laptop1 = new Laptop();
        Laptop1.brand = "Lenovo";
        Laptop1.model = "Legion slim 5";
        Laptop1.price = 500000.00;

        Laptop Laptop2 = new Laptop();
        Laptop2.brand = "Asus";
        Laptop2.model = "Tuf A15";
        Laptop2.price = 330000.00;

        System.out.println("Laptop1");
        System.out.println("Brand:" + Laptop1.brand);
        System.out.println("Model:" + Laptop1.model);
        System.out.println("Price:" + Laptop1.price);

        System.out.println("Laptop2");
        System.out.println("Brand:" + Laptop2.brand);
        System.out.println("Model:" + Laptop2.model);
        System.out.println("Price:" + Laptop2.price);
    }

}