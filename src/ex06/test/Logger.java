package ex06.test;

public class Logger {
    private String message;
    private static Logger logger = new Logger();

    public Logger() {
    }

    static Logger getInstance() {
        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }

}

