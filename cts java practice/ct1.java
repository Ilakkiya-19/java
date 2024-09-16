import java.util.*;
public class ct1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter the no of litres to fill tank:");
        float n=sc.nextFloat();
        System.out.println("enter the distance");
        float n1=sc.nextFloat();
        System.out.println(fuel( n, n1));
    }
    public static float fuel(float n,float n1)
    {
        float fuel=(n/n1)*100;
        
        float miles=n1*0.6214f;
        
        float gallons=n*0.2642f;
        
        float mg=miles/gallons;
        System.out.println("Distance in miles: " + miles);
        System.out.println("Litres in gallons: " + gallons);
        System.out.println("Miles per gallon: " + mg);
        return fuel;
    }
}
