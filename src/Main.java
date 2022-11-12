import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] str = {"bb", "bb", "cc", "aa", "cc", "dd"};
        Set<String> set = new HashSet<>(Arrays.asList(str));
        String[] result = set.toArray(new String[set.size()]);

        System.out.println(String.join("", result));


    }
}