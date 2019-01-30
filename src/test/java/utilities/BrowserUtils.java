package utilities;

public class BrowserUtils {
    public static final boolean ISWINDOWS;
    public static final boolean ISMAC;

    static {
        ISWINDOWS = System.getProperty("os.name").toLowerCase().contains("windows");
        ISMAC = System.getProperty("os.name").toLowerCase().contains("mac");
    }


}
