package com.example.quanla.book.data.models;

/**
 * Created by QuanLA on 11/7/2017.
 */

public class Book {
    private int image;
    private String url;
    private String name;
    private String category;
    private String summary;

    public Book(int image, String url, String name, String category, String summary) {
        this.image = image;
        this.url = url;
        this.name = name;
        this.category = category;
        this.summary = summary;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Book{" +
                "image=" + image +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
