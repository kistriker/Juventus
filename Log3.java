import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Date;
public abstract class Log3 extends Log2{
    public static void hura(){}
    public static  String getData(){
        Date currentDate = new Date();
        String str = String.format("%tc",currentDate);
        return str;
    }
    public static void setLog(String str){
        File f = new File("log.text");
        try{
            Log2.createFile(f);
            FileWriter writeLog = new FileWriter(f,true);
            writeLog.write(getData()+": "+str+"\n");
            writeLog.close();
        }catch(IOException e){
            e.getStackTrace();
        }
    }
}
