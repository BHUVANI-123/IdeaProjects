import java.io.*;
class GenerateBill{
    public static void main(String args[])throws IOException{
        GetFactype planFactory = new GetFactype();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Vehiclefac p = planFactory.getfacPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.println("Bill amount for "+planName+" of  "+units+" units is: ");
//        try {
//            p.getRate();
//            p.calculateBill(units);
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//
//        }
        if(p!=null){
            p.getRate();
            p.calculateBill(units);
        }
    }
}