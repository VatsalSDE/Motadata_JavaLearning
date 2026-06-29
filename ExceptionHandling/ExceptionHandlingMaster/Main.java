package ExceptionHandlingMaster;

import ExceptionHandlingMaster.service.MonitoringService;

public class Main {
    public static void main(String[] args) {

        MonitoringService service = new MonitoringService();

        service.monitor();

    }
}
