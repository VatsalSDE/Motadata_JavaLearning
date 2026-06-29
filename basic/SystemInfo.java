package Basic;
public class SystemInfo {
    public static void main(String[] args) {
        System.out.println("JVM version: " + System.getProperty("java.version"));
        System.out.println("Total Available Processors "+Runtime.getRuntime().availableProcessors());

        String os_name=System.getProperty("os.name");

        if(os_name.contains("Windows")){
            System.out.println("The OS is WIndows");
        }
        else if(os_name.contains("Linux")){
            System.out.println("The OS is linux");
        }
        else{
            System.out.println("The OS is MAC");
        }
    }
}
