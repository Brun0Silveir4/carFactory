package hatchCar;

import javax.swing.JOptionPane;

public class GolHatch implements HatchCar {

    @Override
    public void showHatchInformation() {
        JOptionPane.showMessageDialog(null, "Você criou um Gol.");
    }
}
