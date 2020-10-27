package org.internship.tutorial;

public class Computer {
    int cpuCores = 8;
    int cpuThreads = 16;
    int cpuFrequencyMHZ = 4300;
    int gpuFrequencyMHZ = 1400;
    int gpuMemoryGB = 8;
    int ramGB = 16;
    int ramFrequencyMHZ = 3200;
    int psuWatts = 650;
    String name;
    double price;

    public static void main(String[] args) {
       Computer computer = new Computer("Computer");
       computer.computerCost(330, 450, 95, 100);
       System.out.println(computer.price);
    }

    public Computer(String name) {
        this.name = name;
    }
    public double computerCost(double cpuCost, double gpuCost, double ramCost, double psuCost) {
        price = cpuCost + gpuCost + ramCost + psuCost;

        return price;
    }
}
