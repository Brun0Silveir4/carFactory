package app;

import factories.CarFactory;
import hatchCar.HatchCar;
import sedanCar.SedanCar;

public class CarApplication {

	private HatchCar hatchcar;
	private SedanCar sedancar;

	public CarApplication(CarFactory factory) {
		hatchcar = factory.buildHatchCar();
		sedancar = factory.buildSedanCar();
	}
	
	public void ShowInformation() {
		hatchcar.showHatchInformation();
		sedancar.showSedanInformation();
	}
	
}
