package org.internship.tutorial;

public class Box {
    String status;
    int length = 10;
    int width = 5;
    int height = 20;

    public int volume() {
        int volume = length * width * height;
        return volume;

    }

    public Box(String status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Box box = new Box("Full");
        box.length = 70;
        box = new Box("half full");
        System.out.println("The box is" + " " + box.status + ".");
        System.out.println("The dimensions are" + " " + box.length + " by " + box.width + " by " + box.height);
        System.out.println("The volume is " + box.volume());

    }
}