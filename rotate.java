import java.util.Arrays;
import java.util.Scanner;

public class rotate {
    public static void rotate1(int[] l)
    {
        int n = l[l.length - 1];
        for (int i = l.length - 2; i >= 0; i--) {
            l[i + 1] = l[i];
        }
        l[0] = n;
    }
    public static void rotate2(int[] l, int k)
    {
        if (k < 0 || k >= l.length) {
            return;
        }
        for (int i = 0; i < k; i++) {
            rotate1(l);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n1=sc.nextInt();
        int l[] = new int[n1];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n1; i++)
        {
            l[i]=sc.nextInt();
        }
        System.out.println("Enter value of k: ");
        int k = sc.nextInt();
        rotate2(l, k);
        System.out.println(Arrays.toString(l));
    }
}
