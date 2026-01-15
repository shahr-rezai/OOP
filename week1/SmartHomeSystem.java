public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new Light("Living Room Light");
        devices[1] = new Thermostat("Bedroom Thermostat");
        devices[2] = new SecurityCamera("Front Door Camera");

        System.out.println("Turning all devices ON.");
        for (SmartDevice d : devices) {
            d.turnOn();
        }
        System.out.println();

        ((Light) devices[0]).showStatus();
        System.out.println();

        ((Thermostat) devices[1]).setTemperature(24);
        System.out.println();

        ((SecurityCamera) devices[2]).recordVideo();
        System.out.println();

        System.out.println("Turning all devices OFF.");
        for (SmartDevice d : devices) {
            d.turnOff();
        }
    }
}
