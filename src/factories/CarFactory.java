package factories;

import hatchCar.HatchCar;
import sedanCar.SedanCar;

public interface CarFactory {

	HatchCar buildHatchCar();
	SedanCar buildSedanCar();
}
