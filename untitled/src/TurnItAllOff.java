import java.util.List;

public class TurnItAllOff implements Command {
    List<ElectronicDevice> deviceList;

    public TurnItAllOff(List<ElectronicDevice> deviceList) {
        this.deviceList = deviceList;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : deviceList) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : deviceList) {
            device.on();
        }
    }
}
