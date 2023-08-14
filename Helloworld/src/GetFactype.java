public class GetFactype {
    //use getPlan method to get object of type Plan
    public Vehiclefac getfacPlan(String vehicletype){
        if(vehicletype == null){
            return null;
        }
        if(vehicletype.equalsIgnoreCase("CAR FACTORY")) {
            return new carfac();
        }
        else if(vehicletype.equalsIgnoreCase("BUS FACTORY")){
            return new busfac();
        }
        else if(vehicletype.equalsIgnoreCase("E-VEHICLE FACTORY")) {
            return new evehiclefac();
        }
        return null;
    }
}