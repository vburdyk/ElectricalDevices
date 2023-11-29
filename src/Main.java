import commands.*;
import devices.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Device> switchedOnDevices = new ArrayList<>();

        AddDeviceCommand addDeviceCommand = new AddDeviceCommand();
        List<Device> devices = addDeviceCommand.getDevices();

        SwitchOnCommand switchOnCommand = new SwitchOnCommand(devices);
        SwitchOffCommand switchOffCommand = new SwitchOffCommand(devices, switchedOnDevices);

        Invoker invoker = new Invoker(addDeviceCommand, switchOnCommand, switchOffCommand);

        invoker.addDevice();
        invoker.addDevice();
        invoker.addDevice();
        invoker.switchOnDevice();
        invoker.switchOnDevice();
        invoker.switchOffDevice();

    }
}