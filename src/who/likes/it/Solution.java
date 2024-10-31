package who.likes.it;

public class Solution {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Piter", "Jack", "Joe", "Mick", "Pat"));
    }

    public static String whoLikesIt(String... names) {
        String result = "";

        switch (names.length) {

            case 0:
                result = "no one likes it";
                break;
            case 1:
                result = names[0] + " likes this";
                break;
            case 2:
                result = names[0] + " and " + names[1] + " likes this";
                break;
            case 3:
                result = names[0] + ", " + names[1] + " and " + names[2] + " likes this";
                break;
            default:
                result = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others likes this";
        }
        return result;
    }
}
