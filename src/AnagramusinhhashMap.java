import java.util.*;
public class AnagramusinhhashMap {
    boolean areAngrams(String s1,String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s1.toCharArray()) {
            map2.put(c, map1.getOrDefault(c, 0) + 1);
        }
        return map1.equals(map2);

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        Anagram obj = new Anagram();
        if (obj.areAnagrams(s1, s2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        sc.close();
    }
}
