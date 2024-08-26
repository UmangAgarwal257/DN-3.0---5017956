public class TestComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam(16)
                .setStorage(512)
                .build();

        Computer computer2 = new Computer.Builder()
                .setCpu("AMD Ryzen 9")
                .setRam(32)
                .setStorage(1024)
                .build();

    }
}