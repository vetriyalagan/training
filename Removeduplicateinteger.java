import java.util.*;

class Removeduplicateinteger {

    public static void remove(int[] a)
    {
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            s.add(a[i]);
        System.out.print(s);
    }
    public static void main(String[] args)
    {
        int a[] = {1, 2, 2, 3, 3, 4, 5};
            remove(a);
    }
}