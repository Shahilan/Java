package day5;
class Book{
    String title;
    String author;
    double price;
    int pages;

    //non return & non parameter method
    void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Pages " + pages);
    }

    void display(){
        System.out.println("Sample");
    }
}
