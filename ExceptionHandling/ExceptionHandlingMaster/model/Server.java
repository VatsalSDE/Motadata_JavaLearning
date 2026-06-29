package ExceptionHandlingMaster.model;

public class Server {
    private int id;
    private String name;
    private String ip;

    public Server(int id, String name, String ip) {
        this.id = id;
        this.name = name;
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + ip;
    }
}
