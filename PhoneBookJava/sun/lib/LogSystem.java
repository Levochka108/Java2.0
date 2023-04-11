package PhoneBookJava.sun.lib;

import PhoneBookJava.Main;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LogSystem {
    public  void logSystemToMain(String[] args) throws Exception{
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler logMain = new ConsoleHandler();
        logger.addHandler(logMain);
        XMLFormatter xamLog = new XMLFormatter();
        logMain.setFormatter(xamLog);

        logger.log(Level.WARNING, "Test log");
        logger.info("Test is done!");

    }
}
