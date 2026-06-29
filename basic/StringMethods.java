package Basic;
public class StringMethods {
    public static void main(String[] args) {
        String log = "  ERROR 2024-01-15 Device R-001 connection timeout  ";

        // Clean it up
        String cleaned = log.trim();
        System.out.println(cleaned);

        // Check type
        System.out.println(cleaned.startsWith("ERROR"));   // true
        System.out.println(cleaned.contains("timeout"));   // true

        // Extract parts
        String[] parts = cleaned.split(" ");
        System.out.println("Level: " + parts[0]);    // ERROR
        System.out.println("Date: " + parts[1]);     // 2024-01-15

        // Replace
        String sanitized = cleaned.replace("R-001", "[DEVICE_ID]");
        System.out.println(sanitized);

        // Substring — extract date
        int dateStart = cleaned.indexOf("2024");
        String date = cleaned.substring(dateStart, dateStart + 10);
        System.out.println("Extracted date: " + date);
    }
}