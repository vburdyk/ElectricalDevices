import commands.*;
import devices.Device;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AddDeviceCommand addDeviceCommand = new AddDeviceCommand();

        List<Device> devices = addDeviceCommand.getDevices();

        SwitchOnCommand switchOnCommand = new SwitchOnCommand(devices);

        List<Device> switchedOnDevices = switchOnCommand.getSwitchedOnDevices();

        SwitchOffCommand switchOffCommand = new SwitchOffCommand(devices, switchedOnDevices);
        SortDeviceCommand sortDeviceCommand = new SortDeviceCommand(devices);
        FindByRangeCommand findByRangeCommand = new FindByRangeCommand(devices);

        Invoker invoker = new Invoker(addDeviceCommand, switchOnCommand, switchOffCommand, sortDeviceCommand, findByRangeCommand);

        invoker.addDevice();
        invoker.addDevice();
        invoker.addDevice();
        invoker.findByRange();
        invoker.sortDevice();
        invoker.switchOnDevice();
        invoker.switchOnDevice();
        invoker.switchOffDevice();

    }
}