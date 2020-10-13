package org.internship.tutorial;

public class Box {
    String status;
    int length = 10;
    int width = 5;
    int height = 20;
    String[] contents = new String[100];


    public int volume() {
        int volume = length * width * height;
        return volume;
    }

    public Box(String status) {
        this.status = status;
    }
    public Box(String status,int length, int width, int height) {
        this.status = status;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void growing(int growthFactor) {
        this.length = length + growthFactor;
        this.width = width + growthFactor;
        this.height = height + growthFactor;
    }
    public String getSizeDescription() {
        if (this.volume() > 15000) {
            return "The Box is Big.";
        } else {
            return "The Box is Small.";
        }
    }

    public static void main(String[] args) {
        Box box = new Box("Full");
        box.length = 1;
        box.growing(13);
        Box box2 = new Box("Empty",6,8,10);
        System.out.println("The dimensions are" + " " + box.length + " by " + box.width + " by " + box.height);
        System.out.println("The volume is " + box.volume());
        System.out.println(box.getSizeDescription());
        System.out.println("The dimensions are" + " " + box2.length + " by " + box2.width + " by " + box2.height);
    }
    public void putIntoBox(String[] args) {
        contents = args;

        if (contents.length > 0) {
            status = "Full";

        } else {
            status = "Empty";

        }

    }
    public void emptyBox() {
        contents = new String[100];
        status = "Empty";

    }
    public void reportStatus() {
        System.out.println("The box is" + " " + this.status + ".");

    }
}
