package unit6;

public class Main {

    public static void main(String[] args) {

        // Nazemnii nazemnii = new Nazemnii("audi",1250,210,160,4,11);
        // System.out.println(nazemnii.getMaxSpeed());
/*Cargo cargo = new Cargo("micrubus",3200,110,380,6,18,3,1600);
        System.out.println(cargo.get_kharakteristiki());
        cargo.is_fit();
        System.out.println("------");
    PassengerCar passengerCar = new PassengerCar("mini",1900,130,160,4,11,"minivan");
        System.out.println(passengerCar.get_kharakteristiki());
        passengerCar.is_fit();
        System.out.println(passengerCar.distance(3));
        System.out.println("------");*/
       /*Civil civil = new Civil("boing", 30000, 900, 1050, 43, 3 );
        System.out.println(civil.get_kharakteristiki());
        civil.is_fit();*/
        Military military = new Military("stels", 5700, 1800, 1730, 23, 1, 3, true);
        System.out.println(military.get_kharakteristiki());
        military.shotAll();

    }
}
