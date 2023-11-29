package commands;

public class Invoker {
    private final Command addDeviceCommand;
    private final Command switchOnCommand;
    private final Command switchOffCommand;

    public Invoker(Command addDeviceCommand, Command switchOnCommand, Command switchOffCommand){
        this.addDeviceCommand = addDeviceCommand;
        this.switchOnCommand = switchOnCommand;
        this.switchOffCommand = switchOffCommand;
    }

    public void addDevice(){
        addDeviceCommand.execute();
    }
    public  void switchOnDevice(){switchOnCommand.execute();}
    public  void switchOffDevice(){switchOffCommand.execute();}

}
