public class Television implements ElectronicDevice {

    private int volume;

    @Override
    public void on() {
        System.out.println("TV is On");
    }

    @Override
    public void off() {
        System.out.println("TV is Off");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV Volume is at: " + volume);

    }

    @Override
    public void volumenDown() {
        volume--;
        System.out.println("TV Volume is at: " + volume);
    }
}
