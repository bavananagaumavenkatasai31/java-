import java.util.*;
public class AnagramusingXOR {
    boolean areAnagrams(String s1,String s2)
    {
        int xor = 0;
        if(s1.length() != s2.length())
            return false;
        for(int i=0;i<s1.length();i++)
        {
            xor ^= s1.charAt(i);
            xor ^= s2.charAt(i);

        }
        return xor == 0;
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
