package com.example.listviewexample;

public class Player {
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable
        //Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
    String name;
    int age;
    double money;
    String sport;
    int image;
    
    public Player(String nameOf, int ageOf, double moneyOf, String sportOf, int imageOf) {
        name = nameOf;
        age = ageOf;
        money = moneyOf;
        sport = sportOf;
        image = imageOf;
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getSport() {
        return this.sport;
    }
    public void setSport(String s) {
        this.sport = s;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public int getPic() {
        return this.image;
    }
    public void setPic(int i) {
        this.image = i;
    }
    public double getMoney() {
        return this.money;
    }
    public void setMoney(String m) {
        this.money = m;
    }
}
