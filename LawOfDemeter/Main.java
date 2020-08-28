package DesignPattern.LawOfDemeter;

public class Main {
    public static void main(String[] args) {
        Lynn lynn = new Lynn();
        lynn.eat();

        Song song = new Song();
        song.eat();
    }
}
