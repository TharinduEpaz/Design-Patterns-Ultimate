public class TurnTvOn implements Command {
    ElectronicDevice device;

    public TurnTvOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
