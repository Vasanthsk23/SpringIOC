package com.book.feedback;

public class FeedBack {
    private String yourname;
    private String bookname;
    private String feedback;

    public String getYourname(){
        return this.yourname;
    }

    public void setYourname(String yourname){
        this.yourname=yourname;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
