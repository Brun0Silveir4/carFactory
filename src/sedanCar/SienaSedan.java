package sedanCar;

import javax.swing.JOptionPane;

public class SienaSedan implements SedanCar{

	@Override
	public void showSedanInformation() {
		JOptionPane.showMessageDialog(null, "Você criou um Siena que é do tipo Sedan.");
	}
}
