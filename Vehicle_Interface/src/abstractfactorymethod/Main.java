package abstractfactorymethod;

public class Main {
    public static void main(String[] args) {
        model123 m1=new model123(600000);
        m1.car_type();
        m1.accelerate();
        m1.engine_capacity();
        m1.music_system();
        m1.brake();
        m1.getPrice();
        m1.getDiscountOnFestival();



        model1234 m2=new model1234(400000);
        m2.refrigeration_type();
        m2.accelerate();
        m2.brake();
        m2.breaking_system();
        m2.emergency_windows();
        m2.getPrice();
        m2.getDiscountOnFestival();
        

    }
}
