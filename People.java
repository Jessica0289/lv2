package Lv2;

public class People {
    private String name;
    private String age;

    public People(String age,String name) {
        this.name =name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getage(){
        return age;
    }
    public void setage(String age){
        this.age = age;
    }
}
