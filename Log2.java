import java.io.File;
import java.io.IOException;
interface Log5{
    public void adunare();
}

public class Log2 implements Log5{
    public static Log2 instance;
    public static Log2 getInstance(){
        if(instance==null)
            instance = new Log2();
        return instance;
    }
    public void method(){
        Log2 instanta = Log2.getInstance();
    }
    public void adunare(){
        //System.out.println("Folosesc metoda adunare");
    }
    public void adunare(int a){
        //System.out.println("Folosesc metoda adunare"+a);
    }
    static void createFile(File f){
        try{
            f.createNewFile();
        }catch(IOException e){
            e.getStackTrace();
        }
    }

}
