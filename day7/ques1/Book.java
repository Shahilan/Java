package ques1;

public class Book {
    private String title;
    private String author;
    private double price;

    //A getter reads a private variable's value.
    //A setter changes a private variable's value.

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

     public String getAuthor() {
        return author;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
        else{
            System.out.println("Invalid price!");
        }
    }

    public double getPrice(){
        return price;
    }

    public static void main(String[] args){
        Book b1 = new Book();
        b1.setTitle("Madol Doova");
        b1.setAuthor("Martin Wickramasinghe");
        b1.setPrice(850);

        b1.setPrice(-200);

        System.out.println("Title: "+b1.getTitle());
        System.out.println("Author: "+b1.getAuthor());
        System.out.println("Price: "+b1.getPrice());

    }

}
