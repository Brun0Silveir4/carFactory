package example;

import javax.swing.JOptionPane;

import app.CarApplication;
import factories.CarFactory;
import factories.FiatFactory;
import factories.VolksFactory;

public class Client {

    private static CarApplication configureCarApplication() {
    	CarApplication app;
        CarFactory factory;
        
        int choose = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a marca do veículo: \n1 - Fiat\n2 - Volks"));
        if (choose == 1) {
            factory = new FiatFactory();
        } else {
            factory = new VolksFactory();
        }
        app = new CarApplication(factory);
        return app;
    }

    public static void main(String[] args) {
    	CarApplication app = configureCarApplication();
        app.ShowInformation();
    }
}
