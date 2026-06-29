package Basic;
public class StringDemo {
    public static void main(String[] args) {
        // Immutability trap
        String s = "hello";
        s.toUpperCase();              // creates new string, doesn't change s
        System.out.println(s);        // still "hello"
        s = s.toUpperCase();          // now captured
        System.out.println(s);        // "HELLO"

        // String pool
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b);         // true — same pool object
        System.out.println(a == c);         // false — c is on heap
        System.out.println(a.equals(c));    // true — same content

        // StringBuilder for building strings
        String[] devices = {"Router-1", "Switch-1", "Firewall-1"};
        StringBuilder report = new StringBuilder();
        report.append("Device Report:\n");
        for (String device : devices) {
            report.append("  - ").append(device).append("\n");
        }
        System.out.println(report.toString());
    }
}