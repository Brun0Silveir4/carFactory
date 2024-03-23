package hatchCar;

import javax.swing.JOptionPane;

public class PalioHatch implements HatchCar {

    @Override
    public void showHatchInformation() {
    	JOptionPane.showMessageDialog(null, "Você criou um Palio.");
    }
}