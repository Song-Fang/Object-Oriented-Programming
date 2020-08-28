package DesignPattern.SimpleFactory;

public class Pizza {
    public String name;

    public void prepare(){
        System.out.println("Prepare "+name+" Pizza");
    }

    public void bake(){
        System.out.println("Bake "+name+" Pizza");
    }

    public void cut(){
        System.out.println("Cut "+name+" Pizza");
    }

    public void box(){
        System.out.println("Box "+name+" Pizza");
    }
}
