package Basic;
public class ScopeDemo {
    // Static scope — one copy, lives forever
    static int requestCount = 0;

    // Instance scope — per object, lives as long as object lives
    private String serviceName;

    public ScopeDemo(String serviceName) {
        this.serviceName = serviceName;
    }

    public void handleRequest(String requestId) {
        // Local scope — lives only inside this method call
        int responseTime = calculateResponse();
        requestCount++;   // modifying static field from instance method — fine

        // Block scope — lives only inside this if block
        if (responseTime > 500) {
            String alert = "Slow response: " + responseTime + "ms";   // block scope
            System.out.println(alert);
        }
        // alert doesn't exist here — compile error if you tried to use it

        System.out.println(serviceName + " handled " + requestId 
            + " in " + responseTime + "ms");
    }

    private int calculateResponse() {
        return (int)(Math.random() * 1000);
    }

    public static void main(String[] args) {
        ScopeDemo s1 = new ScopeDemo("DeviceService");
        ScopeDemo s2 = new ScopeDemo("AlertService");

        s1.handleRequest("REQ-001");
        s2.handleRequest("REQ-002");
        s1.handleRequest("REQ-003");

        System.out.println("Total requests handled: " + requestCount);
    }
}