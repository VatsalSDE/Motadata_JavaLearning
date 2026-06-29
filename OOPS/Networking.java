public abstract class Networking {
    private String id;
    private String ipAddress;
    private DeviceStatus status;

    public Networking(String id, String ipAddress) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.status = DeviceStatus.UNKNOWN;
    }

    // Abstract — every device type must define how it's polled
    public abstract String poll();

    // Concrete — shared behavior, all devices inherit this
    public void updateStatus(DeviceStatus newStatus) {
        System.out.println(id + " status: " + status + " -> " + newStatus);
        this.status = newStatus;
    }

    public String getId() { return id; }
    public String getIpAddress() { return ipAddress; }
    public DeviceStatus getStatus() { return status; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + id + " @ " + ipAddress + " | " + status + "]";
    }
}