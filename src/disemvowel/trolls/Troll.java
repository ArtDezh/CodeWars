package disemvowel.trolls;

// Удаляет все гласные
import java.util.stream.Collectors;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("Hello World! How are you, baby?"));
    }

    public static String disemvowel(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> "AEIOUaeiou".indexOf(c) == -1)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
