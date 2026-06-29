public class MonitoringEngine {
    public static void main(String[] args) {
        Networking[] devices = {
            new Router("R-001", "192.168.1.1", 24),
            new Switch("S-001", "192.168.1.2", "VLAN-10"),
            new Router("R-002", "192.168.1.3", 48)
        };

        // Same loop, same method call — different behavior per device type
        for (Networking device : devices) {
            System.out.println(device.poll());    // polymorphism
            device.updateStatus(DeviceStatus.UP); // inherited method
            System.out.println(device);           // toString
        }
    }
}