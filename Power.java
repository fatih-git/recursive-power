import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        long x=0, y=0;
        long cevap=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Taban Değeri: ");
        x=input.nextLong();

        System.out.print("Üs Değeri: ");
        y=input.nextLong();

        cevap=recursivePower(x,y);

        System.out.println("Sonuc= "+cevap);

    }

    public static long recursivePower(long a, long b){

        if(a==0 && b==0){

            System.out.println("Belirsizdir!");
            return 0;

        }
        else if(a==0)
            return a;
        else if(b==0)
            return 1;


        return a*recursivePower(a, b-1);

    }

}
