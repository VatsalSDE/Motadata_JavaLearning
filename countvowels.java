import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class countvowels {

   public static Set<Character> st = new HashSet<>(Arrays.asList('a', 'e', 'i' , 'o' , 'u'));

    public static boolean check(char a){
        if(st.contains(a)) return true;
        
        return false;
    }
    public static void main(String[] args) {
        String s = "vatsal";
        int n=s.length();

        int count=0;

        for(int i=0;i<n;i++){
            char c =Character.toLowerCase(s.charAt(i));
            if(check(c)) count++;
        }

        System.out.println("The number of vowels are "+count);
    }
}
