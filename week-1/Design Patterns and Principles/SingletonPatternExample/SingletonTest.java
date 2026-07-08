public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Logger 1 reference: " + logger1);
        System.out.println("Logger 2 reference: " + logger2);

        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both references point to the exact same Logger instance.");
        } else {
            System.out.println("FAILURE: Logger references point to different instances.");
        }

        logger1.log("Testing singleton pattern.");
    }
}
