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

    public static void main(String[] args) {
        Box box = new Box("Full");
        box.length = 70;
        box = new Box("half full");
        box.reportStatus();
        System.out.println("The dimensions are" + " " + box.length + " by " + box.width + " by " + box.height);
        System.out.println("The volume is " + box.volume());
        String[] myArray = {"example1", "example2"};
        box.putIntoBox(myArray);
        box.reportStatus();
        box.emptyBox();
        box.reportStatus();
        Box box2 = new Box("Brand New Box");
        box2.reportStatus();
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
