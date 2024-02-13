public class TurnTvUp implements Command {
    ElectronicDevice device;

    public TurnTvUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumenDown();
    }
}
