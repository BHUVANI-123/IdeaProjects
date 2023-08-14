package abstractfactorymethod;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public abstract class Busfactory implements factories {


    @Override
    public void brake(){
        System.out.println("The bus brakes..");
    }
    @Override
    public void accelerate(){
        System.out.println("The bus accelerate");
    }


    public void breaking_system()
    {
        System.out.println("The bus factory...");
    }
    public void emergency_windows()
    {
        System.out.println("The bus has emergency window...");
    }
}
