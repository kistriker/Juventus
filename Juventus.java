import java.util.Scanner;
import java.util.ArrayList;
import Fotbalist.*;
public class Juventus{
    public static void main(String args[]){

        //vector de obiecte
        Rivale[] rivale = new Rivale[6];
        Rivale rivala1 = new Rivale("Napoli");
        Rivale rivala2 = new Rivale("Inter");
        Rivale rivala3 = new Rivale("AC Milan");
        Rivale rivala4 = new Rivale("Lazio");
        Rivale rivala5 = new Rivale("AS Roma");
        Rivale rivala6 = new Rivale("Torino");
        rivale[0] = rivala1;
        rivale[1] = rivala2;
        rivale[2] = rivala3;
        rivale[3] = rivala4;
        rivale[4] = rivala5;
        rivale[5] = rivala6;

        Fotbalist s1= new Fotbalist("Kevin","De_Bruyne","13","30.000.000");
        s1.sumaTransfer=180;

        Fotbalist s2= new Fotbalist("Lionel","Messi","30","100.000.000");
        s2.sumaTransfer=0;

        Fotbalist s3= new Fotbalist("Cristiano","Ronaldo","7","100.000.000");
        s3.sumaTransfer=-35;
        String NUME;
        int opt = -1;
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);
        while(opt!=0)
        {
            System.out.println("Optiuni:");
            System.out.println("1.Bani castigati/pierduti perioada transferuri");
            System.out.println("2.Identificare fotbalist transferat");
            System.out.println("3.Verificare fair play financiar");
            System.out.println("4.Conditie de transferare jucator");
            System.out.println("5.Fotbalisti");
            System.out.println("6.Rivale");
            System.out.println("0.Bye bye Juve");
            opt=sc.nextInt();
            double suma = 0.0;
            if(opt==1){
                suma = s1.getSumaTransfer() + s2.getSumaTransfer() + s3.getSumaTransfer();
                System.out.println("Suma este:" + suma + " de milioane!");
            }
            if(opt==2){

                System.out.print("Nume jucator: ");
                NUME = sc.next();
                if(s1.getNume().equals(NUME) ){
                    System.out.println("Jucatorul exista in echipa:" + NUME + "- Juventus");
                }
                else if(s2.getNume().equals(NUME) ){
                    System.out.println("Jucatorul exista in echipa:" + NUME + "- Juventus");
                }
                else if(s3.getNume().equals(NUME) ){
                    System.out.println("Jucatorul exista in echipa:" + NUME + "- Juventus");
                }
                else {
                    System.out.println("Jucatorul nu exista in echipa! Cauta la alta echipa!");
                }
            }
            if(opt==3){
                if(suma> -10.0)
                    System.out.println("Nicio sanctiune!");
                else
                    System.out.println("Out din Europa!");
            }
            if(opt==4){
                System.out.println("Care jucator: De Bruyne(1) Messi(2) sau Ronaldo(3)");
                System.out.println("Alege cifra corespunzatoare jucatorului dorit!");
                int ctt;
                ctt=sc.nextInt();
                if(ctt==1){
                    if(s1.transferSauNuJucator(100.0))
                        System.out.println("Transfera jucator!");
                    else
                        System.out.println("Nu transfera jucator!");
                }
                if(ctt==2){
                    if(s2.transferSauNuJucator(100.0))
                        System.out.println("Transfera jucator!");
                    else
                        System.out.println("Nu transfera jucator!");
                }
                if(ctt==3){
                    if(s3.transferSauNuJucator(100.0))
                        System.out.println("Transfera jucator!");
                    else
                        System.out.println("Nu transfera jucator!");
                }
            }
            if(opt==0){
                System.out.println("Multumim ca ati apelat la noi, va mai asteptam!");
            }
            if(opt==5){
                System.out.println( s1.toString() );
                System.out.println( s2.toString() );
                System.out.println( s3.toString() );
            }
            if(opt==6){
                System.out.println(rivale[0].nume);
                System.out.println(rivale[1].nume);
                System.out.println(rivale[2].nume);
                System.out.println(rivale[3].nume);
                System.out.println(rivale[4].nume);
                System.out.println(rivale[5].nume);
            }
            System.out.println(" ");
        }
    }
}
