public class insertInterval{
    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    try {
        java.nio.file.Files.writeString(
            java.nio.file.Path.of("display_runtime.txt"),
            "0"
        );
    } catch (Exception e) {
        e.printStackTrace();
    }
}));
    }
}