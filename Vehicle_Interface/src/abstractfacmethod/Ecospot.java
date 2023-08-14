package abstractfacmethod;


public  class Ecospot extends carfac {

    @Override
    public void Bluetooth() {
        super.Bluetooth();
    }

    @Override
    public void GPS_Tracker() {
        super.GPS_Tracker();
    }

    @Override
    public void price() {
        super.price();
    }

    @Override
    public void festivaldiscount() {
        super.festivaldiscount();
    }

    @Override
    public void sales() {
        super.sales();
    }


    public void Mileage() {
        System.out.println("Mileage upto 15.9kmpl..");
    }

    public void Fuel_Capacity() {
        System.out.println("It can hold upto 52Litres..");
    }
}





