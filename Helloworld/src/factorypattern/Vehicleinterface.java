package factorypattern;

public interface Vehicleinterface {
    public void getRate();
    public default void calculateBill(int units,int rate)
    {
        System.out.println(units*rate);
    }

}
