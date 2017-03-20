/*-----------------------------------------------
 My name: Chi Hieu Chu
 My student number: 5533570
 My email address: chc116@uowmail.edu.au
 Assignment number: 
 -------------------------------------------------*/
package farmsimulator;

public class MilkingRobot {

    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.getBulkTank() == null) {
            throw new IllegalStateException("SKADOOSH");
        } else {
            double amount = milkable.milk();
            this.tank.addToTank(amount);
        }

    }
}
