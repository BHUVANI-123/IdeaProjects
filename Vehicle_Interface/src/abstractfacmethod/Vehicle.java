package abstractfacmethod;

public class Vehicle {
    public static void main(String[] args) {
        Ecospot eco = new Ecospot();
        eco.brake();
        eco.accelerate();
        eco.Bluetooth();
        eco.GPS_Tracker();
        eco.Fuel_Capacity();
        eco.Mileage();
        System.out.println();
        eco.price();
        eco.festivaldiscount();
        eco.sales();}}