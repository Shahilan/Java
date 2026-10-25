class Calculator{
    int num1 = 20;
    int num2 = 10;

    //method1
    //non parameterized | non return type

    void addnumbers(){
        //method scope
        int tot = num1+num2;
        System.out.println("Add: " + tot);
    }

    //method2 
    //parameterized | non return = void method
    void subnumbers(int a, int b){
        int sub = a-b;
        System.out.println("Sub: " + sub);
    }

    //method3
    //non parameterized | return type
    int divnumbers(){
        int div = num1/num2;
        return div;
    }

    //method4
    //parameterized | return type
    int mulnumbers(int a){
        int mul = num1*a;
        System.out.println("Mul: " + mul);
        return mul;
    }
}