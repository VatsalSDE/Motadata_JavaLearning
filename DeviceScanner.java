public class DeviceScanner {
    public static void main(String[] args) {
        String[] devices = {"Router-1", "Switch-2", "CRITICAL-Device", "Firewall-1"};

        // Early exit pattern — stop as soon as critical device found
        String criticalDevice = null;
        for (String device : devices) {
            if (device.startsWith("CRITICAL")) {
                criticalDevice = device;
                break;   // no point checking rest
            }
        }

        if (criticalDevice != null) {
            System.out.println("Alert! Critical device found: " + criticalDevice);
        } else {
            System.out.println("All devices normal");
        }
    }
}