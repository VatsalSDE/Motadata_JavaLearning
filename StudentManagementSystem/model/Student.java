package model;

public class Student {
    private int id;
    private String name;
    private int standard;
    private int age;

    Student(int i , String nm , int std , int ag){
        this.id=i;
        this.name=nm;
        this.standard=std;
        this.age=ag;
    }

    public int getid(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int standard(){
        return standard;
    }
}
