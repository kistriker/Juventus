package Frame3;
abstract class Antrenament{
    public String shout(){
        //System.out.println("Porniti antrenamentul!");
        String msg="Porniti antrenamentul!\n";
        return msg;
    }
    public abstract String exercitii();
}
class Exercises extends Antrenament{
    public String exercitii(){
        String msg="1000 de flotari!\n50 de ture de stadion!!\n500 de abdomene!\nApoi 2 ore in sala de forțe!\n";
        /*System.out.println("1000 de flotari!");
        System.out.println("50 de ture de stadion!!");
        System.out.println("500 de abdomene!");
        System.out.println("Apoi 2 ore in sala de forțe!");
        */
        return msg;
    }
}
public class Antrenor {
    /*public static void test() {
        Exercises exc = new Exercises();
        exc.exercitii();
    }*/
    public static String test() {
        Exercises exc = new Exercises();
        String ms=exc.shout();
        String msg=exc.exercitii();
        ms += msg;
        return ms;//return msg;
    }
}
