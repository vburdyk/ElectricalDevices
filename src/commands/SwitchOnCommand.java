package commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import devices.Device;

public class SwitchOnCommand implements Command {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Device> devices;
    private final List<Device> switchedOnDevices;

    public SwitchOnCommand(List<Device> devices) {
        this.devices = devices;
        this.switchedOnDevices = new ArrayList<>();
    }

    public List<Device> getSwitchedOnDevices() {
        return switchedOnDevices;
    }

    @Override
    public void execute() {
        if (devices.isEmpty()) {
            System.out.println("There are no created devices, please add at least 1 device");
            return;
        }
        System.out.println("Please, enter the name of the device which you want to turn on: ");
        String selectedDeviceName = scanner.nextLine();
        boolean foundDevice = false;
        for (Device device : devices) {
            if (device.getName().equalsIgnoreCase(selectedDeviceName)) {
                foundDevice = true;
                if (device.isOn()) {
                    System.out.println("The selected device is already turned on.");
                } else {
                    device.turnOn();
                    switchedOnDevices.add(device);
                    System.out.println(device.getName() + " turned on.");
                    System.out.println("List of turned on devices: ");
                    for (int i = 0; i < switchedOnDevices.size(); i++) {
                        if (switchedOnDevices.get(i).isOn()) {
                            System.out.println(i + 1 + ". " + switchedOnDevices.get(i));
                        }
                    }
                }
                break;
            }
        }
        if (!foundDevice) {
            System.out.println("Device not found. Please enter a valid device name.");
        }
    }
}