package Basic;
public class NetworkLatency {

    public static void readings(int[] lat){
        int critical=0;
        for(int i: lat){
            if(i<100){
                System.out.println("Normal "+i);
            }
            else if(i>=100 && i<=499){
                System.out.println("Warning "+i);
            }
            else{
                System.out.println("Critical "+i);
                critical++;
            }
        }
        System.out.println("The total number of criticals are "+critical);
    }
    public static void main(String[] args) {
        int[] arr={12, 450, 8, 980, 23, 670, 15};
        readings(arr);
    }
}
