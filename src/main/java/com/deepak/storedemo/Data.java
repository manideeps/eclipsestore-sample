package com.deepak.storedemo;

public class Data {

  public Data(){
    super();
  }

  private String welcomeText;

  private final Books books = new Books();

  public Books getBooks() {
    return books;
  }

  public String getWelcomeText() {
    return welcomeText;
  }

  public void setWelcomeText(String welcomeText) {
    this.welcomeText = welcomeText;
  }
}
