package abstractfactorymethod;

import java.sql.SQLOutput;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Carfactory implements factories {





    double rate=600000;
    @Override
    public void brake(){
        System.out.println("The car brakes..");
    }
    @Override
    public void accelerate(){
        System.out.println("The car accelerate");
    }
    public void music_system()
    {
        System.out.println("The car has music player");
    }



    public void engine_capacity()
    {
        System.out.println("The speed goes to 1200cc");
    }
    public void car_type()
    {
        System.out.println("It is car factory ");
    }
}
