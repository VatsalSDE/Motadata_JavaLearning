import java.util.*;

public class DeviceRegistry {
    
    // HashMap for O(1) device lookup by ID
    private Map<String, String> deviceIpMap = new HashMap<>();

    // LinkedHashSet for unique device IDs in registration order
    private Set<String> registeredIds = new LinkedHashSet<>();

    // PriorityQueue for alert processing — highest severity first
    private PriorityQueue<Alert> alertQueue = new PriorityQueue<>(
        Comparator.comparingInt(Alert::getSeverity).reversed()
    );

    public void registerDevice(String id, String ip) {
        deviceIpMap.put(id, ip);
        registeredIds.add(id);
        System.out.println("Registered: " + id + " → " + ip);
    }

    public String getDeviceIp(String id) {
        return deviceIpMap.getOrDefault(id, "UNKNOWN");
    }

    public void addAlert(Alert alert) {
        alertQueue.offer(alert);
    }

    public void processNextAlert() {
        Alert a = alertQueue.poll();
        if (a != null) {
            System.out.println("Processing: " + a);
        }
    }

    public void printAllDevices() {
        // LinkedHashSet gives insertion order
        for (String id : registeredIds) {
            System.out.println(id + " → " + deviceIpMap.get(id));
        }
    }

    static class Alert {
        private String message;
        private int severity;   // higher = more critical

        Alert(String message, int severity) {
            this.message = message;
            this.severity = severity;
        }

        public int getSeverity() { return severity; }

        @Override
        public String toString() {
            return "[severity=" + severity + "] " + message;
        }
    }

    public static void main(String[] args) {
        DeviceRegistry registry = new DeviceRegistry();

        registry.registerDevice("R-001", "192.168.1.1");
        registry.registerDevice("S-001", "192.168.1.2");
        registry.registerDevice("F-001", "192.168.1.3");

        System.out.println("\nAll devices (insertion order):");
        registry.printAllDevices();

        System.out.println("\nDevice lookup:");
        System.out.println(registry.getDeviceIp("R-001"));
        System.out.println(registry.getDeviceIp("X-999"));

        registry.addAlert(new Alert("Link Down on S-001", 3));
        registry.addAlert(new Alert("CPU High on R-001", 7));
        registry.addAlert(new Alert("Interface Error on F-001", 5));

        System.out.println("\nProcessing alerts by priority:");
        registry.processNextAlert();   // severity 7 first
        registry.processNextAlert();   // severity 5
        registry.processNextAlert();   // severity 3
    }
}