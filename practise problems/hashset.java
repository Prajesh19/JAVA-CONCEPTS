import java.util.HashSet;
import java.util.LinkedHashSet;
public class hashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("apple");
        set.add("orange");
        set.add("mango");
        set.add("apple");
        set.remove("mango");
        System.out.println(set);
    }
}
