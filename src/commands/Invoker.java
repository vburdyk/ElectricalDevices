package commands;

public class Invoker {
    private final Command addDeviceCommand;
    private final Command switchOnCommand;
    private final Command switchOffCommand;
    private final Command sortDeviceCommand;

    public Invoker(Command addDeviceCommand, Command switchOnCommand, Command switchOffCommand, Command sortDeviceCommand) {
        this.addDeviceCommand = addDeviceCommand;
        this.switchOnCommand = switchOnCommand;
        this.switchOffCommand = switchOffCommand;
        this.sortDeviceCommand = sortDeviceCommand;
    }

    public void addDevice() {
        addDeviceCommand.execute();
    }

    public void switchOnDevice() {
        switchOnCommand.execute();
    }

    public void switchOffDevice() {
        switchOffCommand.execute();
    }
    public void sortDevice() {
        sortDeviceCommand.execute();
    }
}
