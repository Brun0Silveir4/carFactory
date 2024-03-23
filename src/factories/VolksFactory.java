package factories;

import hatchCar.GolHatch;
import hatchCar.HatchCar;
import sedanCar.SedanCar;
import sedanCar.VoyageSedan;

public class VolksFactory implements CarFactory {

    @Override
    public HatchCar buildHatchCar() {
   
    	return new GolHatch();
    }

    @Override
    public SedanCar buildSedanCar() {
        return new VoyageSedan();
    }
}
