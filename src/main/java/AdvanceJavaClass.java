import org.apache.log4j.Logger;

public class AdvanceJavaClass {


    public static void main(String[] args) {

        Logger log = Logger.getLogger(AdvanceJavaClass.class);

        org.apache.log4j.BasicConfigurator.configure();
        log.info("Java Class for Advanced Users");

    }
}
