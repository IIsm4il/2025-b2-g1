# Repository de cours sur le javaimport java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Application started");
        // Add your code here
        LOGGER.info("Application finished");
    }
}