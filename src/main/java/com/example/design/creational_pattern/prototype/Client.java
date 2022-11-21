package com.example.design.creational_pattern.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("최준호", "유명한 회사");
        Publisher publisher = new Publisher(author);
        publisher.createPublisher("좋은 책", "좋은 출판사");
        System.out.println(publisher.getBook());

        Publisher publisher2 = (Publisher) publisher.deepClone();
        author.changeAuthor("juno choi", "famous company");
        System.out.println(publisher2.getBook());

        System.out.println(publisher == publisher2);
        System.out.println(publisher.getClass() == publisher2.getClass());
        System.out.println(publisher.getAuthor() == publisher2.getAuthor());
    }
}
