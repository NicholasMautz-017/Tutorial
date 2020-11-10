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
       Computer computer2 = new Computer("Computer2");
       computer2.computerCost(250, 500, 145, 150);
       boolean isCheaper = computer.isCheaperThan(computer2);
       computer.cpuFrequencyMHZ = 5000;
       boolean hasHigherFrequency = computer.hasHigherCPUFrequency(computer2);
        System.out.println(isCheaper);
        System.out.println(computer2.price);
        System.out.println("It is " + hasHigherFrequency + " that computer 1 has a higher frequency than computer 2");
    }

    public Computer(String name) {
        this.name = name;
    }

    public double computerCost(double cpuCost, double gpuCost, double ramCost, double psuCost) {
        price = cpuCost + gpuCost + ramCost + psuCost;

        return price;
    }
    public boolean isCheaperThan(Computer otherComputer) {
        if(price < otherComputer.price) {
            return true;
        } else {
            return false;
        }
    }
    public boolean hasHigherCPUFrequency(Computer otherComputer) {
        if (otherComputer.cpuFrequencyMHZ < this.cpuFrequencyMHZ) {

            return true;
        } else {
            return false;
        }
    }
}
