public class Thermostat extends SmartDevice {
    Thermostat(String name) {
        super(name);
    }

    void setTemperature(int temp) {
        System.out.println(name + " is set to " + temp + "°C.");
    }
}
