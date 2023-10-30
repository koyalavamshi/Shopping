package utility;


import org.apache.log4j.Logger;

public class Log4j {
    //Initialize Log4j logs
    public static Logger Log = Logger.getLogger(Logger.class.getName());
    //Need to create these methods,so that they can be called
    public static void info(String message){
        Log.info(message);
    }

}
