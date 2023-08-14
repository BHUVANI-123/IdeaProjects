import java.io.*;
public class sample {
    public static void main(String[] args){
    String ptr = null;
    try
    {
        if (ptr.equals("abc"))
            System.out.print("same");
        else
            System.out.print("Not Same");
    }
    catch(NullPointerException e)
    {
        System.out.print("NullPointerException");
    }}
}

