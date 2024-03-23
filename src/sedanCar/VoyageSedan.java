package sedanCar;

import javax.swing.JOptionPane;

public class VoyageSedan implements SedanCar{

	@Override
	public void showSedanInformation() {
		JOptionPane.showMessageDialog(null, "Você criou um Voyage que é do tipo Sedan.");
	}
}
