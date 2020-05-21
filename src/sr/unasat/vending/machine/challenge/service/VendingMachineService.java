package sr.unasat.vending.machine.challenge.service;

import sr.unasat.vending.machine.challenge.entities.Beverage;

public class VendingMachineService {
    private  final Beverage beverage1;
    private  final Beverage beverage2;

    public VendingMachineService(Beverage firstBeverag, Beverage secondBeverage) {
        this.beverage1 = firstBeverag;
        this.beverage2 = secondBeverage;
    }

    public String fetchBeverage(int selection) {
  /*      if (selection == null || selection.trim().isEmpty()){
            return "U heeft geen keuze gemaakt";
        }*/

        String message;
        switch (selection) {
            case 1:
                message = "Neem uw " + beverage1.getNaam() + " uit de bak. Bedankt voor uw SRD " + beverage1.getPrice();
                break;
            case 2:
                message = "Neem uw " + beverage2.getNaam() +" uit de bak. Bedankt voor uw SRD " + beverage2.getPrice();
                break;
            default:
                message = "De door u gemaakte keuze komt niet voor";
        }
        return message;
    }

    public String displayChoices(){
        String message;
        message = "optie 1: " + beverage1.getNaam() + " price: " + beverage1.getPrice()
                + "\noptie 2: " + beverage2.getNaam() + " price: " + beverage2.getPrice();
        return message;
    }
}
