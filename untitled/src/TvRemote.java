public class TvRemote {

    //    Static methods belong to the class rather than any instance of the class. They can be called without
//    creating an instance of the class.
    public static ElectronicDevice getDevice() {

        return new Television();

    }

}
