package com.example.design.creational_pattern.prototype;

public class Publisher implements Cloneable{
    private Author author;
    private String bookName;
    private String publisherName;

    public Publisher(Author author) {
        this.author = author;
    }

    public void createPublisher(String bookName, String name){
        this.bookName = bookName;
        this.publisherName = name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBook(){
        return String.format("[책 이름] : %s, [출판사] : %s, [저자] : %s, [저자의 직장] : %s", bookName, publisherName, author.getAuthor(), author.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone(){
        Author author = new Author(this.author.getAuthor(), this.author.getCompany());
        Publisher publisher = new Publisher(author);
        publisher.createPublisher("좋은 책", "좋은 출판사");
        return publisher;
    }
}
