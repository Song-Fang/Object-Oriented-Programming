package DesignPattern.DependencyInverse;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.take(new Chemistry());
    }
}
