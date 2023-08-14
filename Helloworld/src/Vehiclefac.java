import java.io.*;
import java.util.*;
public class Vehiclefac {
   protected double rate;

    double getRate() {
        return rate;
    }

    public void calculateBill(int units){

        System.out.println(units*this.rate);
    }
}
