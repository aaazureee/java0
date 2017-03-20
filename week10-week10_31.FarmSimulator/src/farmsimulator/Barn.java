/*-----------------------------------------------
 My name: Chi Hieu Chu
 My student number: 5533570
 My email address: chc116@uowmail.edu.au
 Assignment number: 
 -------------------------------------------------*/
package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (this.milkingRobot == null) {
            throw new IllegalStateException();
        } else {
            this.milkingRobot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (this.milkingRobot == null) {
            throw new IllegalStateException();
        } else {
            for (Cow c : cows) {
                this.milkingRobot.milk(c);
            }
        }

    }

    @Override
    public String toString() {
        return "Barn: " + Math.ceil(this.getBulkTank().getVolume()) + "/" + Math.ceil(this.getBulkTank().getCapacity());
    }

}
