package commands;

import devices.Device;

import java.util.List;
import java.util.Scanner;

public class FindByRangeCommand implements Command {

    private final List<Device> devices;

    public FindByRangeCommand(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial limit: ");
        float initPower = scanner.nextFloat();

        System.out.println("Enter the final limit: ");
        float finalPower = scanner.nextFloat();

        System.out.println("Devices from " + initPower + " watts " + "to " + finalPower + " watts");
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getPower() >= initPower && devices.get(i).getPower() <= finalPower) {
                System.out.println(i + 1 + ". " + devices.get(i));
            }
        }
    }
}
