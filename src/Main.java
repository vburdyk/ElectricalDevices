import commands.*;
import devices.Device;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddDeviceCommand addDeviceCommand = new AddDeviceCommand();

        List<Device> devices = addDeviceCommand.getDevices();

        SwitchOnCommand switchOnCommand = new SwitchOnCommand(devices);

        List<Device> switchedOnDevices = switchOnCommand.getSwitchedOnDevices();

        SwitchOffCommand switchOffCommand = new SwitchOffCommand(devices, switchedOnDevices);

        SortDeviceCommand sortDeviceCommand = new SortDeviceCommand(devices);

        Invoker invoker = new Invoker(addDeviceCommand, switchOnCommand, switchOffCommand, sortDeviceCommand);

        invoker.addDevice();
        invoker.addDevice();
        invoker.addDevice();
        invoker.sortDevice();
        invoker.switchOnDevice();
        invoker.switchOnDevice();
        invoker.switchOffDevice();

    }
}