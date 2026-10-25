import java.util.Scanner;
public class SecondJava {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your hometown: ");
        String town = scan.nextLine();

        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.print("Home town is " + town);
    }
}