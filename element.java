import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class element {
    public static void main(String[] args)
    {
        List<Integer> a = new ArrayList<>();
        a.add(84);
        a.add(32);
        a.add(76);
        a.add(10);
        a.add(55);
        int min = Collections.min(a);
        int max = Collections.max(a);
        if (min == max) {
            System.out.println("elements are equal");
        }
        else {
            System.out.println("min value: "+ min);
            System.out.println("max value: "+ max);
        }
    }
}