class Logger {

    private static Logger instance = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void sendEmail() {
        System.out.println("Sending email...");
    }

    public static void main(String[] args) {
        Logger  lg = getInstance();
        
        lg.sendEmail();
    }

}