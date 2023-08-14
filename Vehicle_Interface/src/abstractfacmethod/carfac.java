package abstractfacmethod;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
public abstract class carfac implements factories {

    @Override
    public void brake(){
        System.out.println("The car brakes..");
    }
    @Override
    public void accelerate(){
        System.out.println("The car accelerate");
    }


    public void Bluetooth(){
        System.out.println("Bluetooth Connected..");
    }

    public void GPS_Tracker(){
        System.out.println("GPS Tracker Available");
    }
    int price= 90000;
//int quantity=100;

    public void price(){
        System.out.println("Today's price : $"+price);
    }

    public void festivaldiscount(){
        double dis=price-(price*10.0)/100.0;
        System.out.println("Price after 10% discount: $"+dis);

    }

    public void sales(){
        LocalDate startdate=LocalDate.of(2023, Month.JULY,24);
        LocalDate enddate=LocalDate.of(2023,Month.AUGUST,11);
        long days= ChronoUnit.DAYS.between(startdate,enddate);
        System.out.println("Number of cars sold between "+startdate+" and "+enddate+" i.e for "+days+" days is 30 units");
    }


}
