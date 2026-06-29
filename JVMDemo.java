public class JVMDemo {
    public static void main(String[] args) {
        System.out.println("JVM version: " + System.getProperty("java.version"));
        System.out.println("OS: " + System.getProperty("os.name"));
        System.out.println("Max memory available to JVM: " 
            + Runtime.getRuntime().maxMemory() / (1024 * 1024) + " MB");
    }
}
