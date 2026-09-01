public class first_java{
    public static void main(String[] args){
        //print methods
        System.out.print("hello");
        System.out.println(" world!");
        System.out.print("hey\n");
        System.out.println("siri");

        /*
        this
        is
        the multi line comment
         */

        //variables
        //primitive data type
        int age = 21;
        int year = 2026;
        System.out.println("this year is "+ year);
        System.out.println("age= " + age + " year= " + year);
        double gpa = 3.91;
        char grade = 'A';
        boolean isStudent = true;
        //reference data type
        String name = "Hey Shahi";
        System.out.println("gpa=" + gpa + " " + "grade=" + grade + " " + "name=" + name);
        if(isStudent){
            System.out.println("your are student");
        }
        else {
            System.out.println("your are not student");
        }
    }
}