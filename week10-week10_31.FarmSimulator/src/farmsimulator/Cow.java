/*-----------------------------------------------
 My name: Chi Hieu Chu
 My student number: 5533570
 My email address: chc116@uowmail.edu.au
 Assignment number: 
 -------------------------------------------------*/
package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private int capacity;
    private double milk;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};    

    public Cow() {
        this.capacity = 15 + new Random().nextInt(26);
        int index = new Random().nextInt(31);
        this.name = NAMES[index];
        this.milk = 0;
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
        this.milk = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.milk;
    }
    
 
    @Override
    public String toString(){
        return this.name + " " + Math.ceil(this.milk) + "/" + Math.ceil(this.capacity);
    }

  
    @Override
    public double milk() {
        double milkTaken = this.milk;
        this.milk= 0;
        return milkTaken;
    }

  
    @Override
    public void liveHour() {
        this.milk += (7 + new Random().nextInt(20 - 7 + 1)) / 10.0;
        if (this.milk > this.capacity) {
            this.milk = this.capacity;
        }
    }

}
