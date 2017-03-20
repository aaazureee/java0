/*-----------------------------------------------
 My name: Chi Hieu Chu
 My student number: 5533570
 My email address: chc116@uowmail.edu.au
 Assignment number: 
 -------------------------------------------------*/
package farmsimulator;

import java.util.*;

public class Farm implements Alive {

    private String name;
    private Barn barn;
    private List<Cow> cowList;

    public Farm(String name, Barn barn) {
        this.barn = barn;
        this.name = name;
        this.cowList = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.name;
    }

    @Override
    public void liveHour() {
        for (Cow c : this.cowList) {
            c.liveHour();
        }
    }

    public void addCow(Cow c) {
        this.cowList.add(c);
    }

    public void manageCows() {
        this.barn.takeCareOf(cowList);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);

    }

    @Override
    public String toString() {
        String cowPrint = "";
        for (Cow c : this.cowList) {

            cowPrint += "\n" + "        " + c;
        }

        if (this.cowList.size() == 0) {
            return "Farm owner: " + this.name + "\n" + "Barn bulk tank: " + Math.ceil(this.barn.getBulkTank().getVolume()) + "/" + Math.ceil(this.barn.getBulkTank().getCapacity())
                    + "\n" + "No cows.";

        } else {
            return "Farm owner: " + this.name + "\n" + "Barn bulk tank: " + Math.ceil(this.barn.getBulkTank().getVolume()) + "/" + Math.ceil(this.barn.getBulkTank().getCapacity()) + "\n"
                    + "Animals: " + cowPrint;
        }

    }

}
