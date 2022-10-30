package Frame3;
import java.util.logging.Level;
public class Log1 {
    public static void test() {
        try{
            Log my_log = new Log("log.text");
            my_log.logger.setLevel(Level.WARNING);
            my_log.logger.info("Info msg");
            my_log.logger.warning("warning msg");
            my_log.logger.severe("Severe msg");
        }catch(Exception e){

        }
    }
}
