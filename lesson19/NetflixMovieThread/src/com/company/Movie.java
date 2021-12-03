package com.company;

public class Movie {

    private int id;
    private String title;
    private String director;
    private String genre;
    private Category category;
    private long views;
    private int length;

    public Movie(int id, String title, String director, String genre,
                 Category category, int views, int length) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.category = category;
        this.views = views;
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Mã " + id + " - " + title + " - " + director + " - " + genre + " - "
                + category.getValue() + " - Lượt xem: " + views + " - Thời lượng: " + length + " phút";
    }
}
