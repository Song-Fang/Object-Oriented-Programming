package DesignPattern.AbstractFactory;

public class Pizza {
    String name;
    public void prepare(){
        System.out.println(name+" is preparing!");
    }

    public void bake(){
        System.out.println(name+" is baking!");
    }

    public void cut(){
        System.out.println(name+" is cuttring!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
