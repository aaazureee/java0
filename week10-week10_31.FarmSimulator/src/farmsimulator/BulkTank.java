/*-----------------------------------------------
 My name: Chi Hieu Chu
 My student number: 5533570
 My email address: chc116@uowmail.edu.au
 Assignment number: 
 -------------------------------------------------*/
package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (this.volume + amount > this.capacity) {
            this.volume = this.capacity;
        } else {
            this.volume += amount;
        }

    }

    public double getFromTank(double amount) {
        if (this.volume - amount < 0) {
            this.volume = 0;
            return this.volume;
        } else {
            this.volume -= amount;
            return this.volume;
        }

    }
    
     public String toString(){
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
}
