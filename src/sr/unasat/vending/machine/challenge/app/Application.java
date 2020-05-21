package sr.unasat.vending.machine.challenge.app;

import sr.unasat.vending.machine.challenge.entities.Beverage;
import sr.unasat.vending.machine.challenge.service.VendingMachineService;

public class Application {
    public static void main(String[] args) {
        VendingMachineService vs = null;
        Beverage bev1 = new Beverage("COLA", 6.00);
        Beverage bev2 = new Beverage("CREME", 13.00);

        if (bev1 != null && bev2 != null) {
            vs = new VendingMachineService(bev1, bev2);
            System.out.println(vs.displayChoices());
            System.out.println(vs.fetchBeverage(1));
        }
    }
}
