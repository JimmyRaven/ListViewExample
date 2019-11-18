package com.example.listviewexample;

public class Player {
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable
        //Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
    String name;
    int age;
    long money;
    String sport;
    int image;
    
    public Player(String nameOf, int ageOf, double moneyOf, String sportOf, int imageOf) {
        name = nameOf;
        age = ageOf;
        money = (long)moneyOf;
        sport = sportOf;
        image = imageOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
