import java.util.Hashtable;

public class Dictionary {
    public static Integer RomeToArabian(String number) {
        Hashtable<String, Integer> dictionary = new Hashtable<String, Integer>();

        dictionary.put("I", 1);
        dictionary.put("II", 2);
        dictionary.put("III", 3);
        dictionary.put("IV", 4);
        dictionary.put("V", 5);
        dictionary.put("VI", 6);
        dictionary.put("VII", 7);
        dictionary.put("VIII", 8);
        dictionary.put("IX", 9);
        dictionary.put("X", 10);
        dictionary.put("XX", 20);
        dictionary.put("XXX", 30);
        dictionary.put("XL", 40);
        dictionary.put("L", 50);
        dictionary.put("LX", 60);
        dictionary.put("LXX", 70);
        dictionary.put("LXXX", 80);
        dictionary.put("XC", 90);
        dictionary.put("C", 100);
        dictionary.put("CC", 200);
        dictionary.put("CCC", 300);
        dictionary.put("CD", 400);
        dictionary.put("D", 500);
        dictionary.put("DC", 600);
        dictionary.put("DCC", 700);
        dictionary.put("DCCC", 800);
        dictionary.put("CM", 900);
        dictionary.put("M", 1000);
        return dictionary.getOrDefault(number, null);
    }
}
