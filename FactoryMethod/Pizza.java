package DesignPattern.FactoryMethod;

public  class Pizza {
    public String name;

    public  void prepare(){
        System.out.println(name+" has been prepared.");
    }
    public  void bake(){
        System.out.println(name+" has been baked.");
    }
    public void cut(){
        System.out.println(name+" has been cut.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
