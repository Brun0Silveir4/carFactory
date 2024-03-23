package factories;

import hatchCar.HatchCar;
import hatchCar.PalioHatch;
import sedanCar.SedanCar;
import sedanCar.SienaSedan;

public class FiatFactory implements CarFactory {

    @Override
    public HatchCar buildHatchCar() {
   
    	return new PalioHatch();
    }

    @Override
    public SedanCar buildSedanCar() {
        return new SienaSedan();
    }
}
