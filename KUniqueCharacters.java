public class KUniqueCharacters {
    public static boolean search(String temp, char letter) {
        for (int x = 0; x < temp.length(); x++) {
            if (letter == temp.charAt(x)) {
                return true;
            }
        }
        return false;
    }

    public static int uniqueCount(String temp) {
        StringBuilder uniqueString = new StringBuilder();

        for (int x = 0; x < temp.length(); x++) {
            if (!search(uniqueString.toString(), temp.charAt(x))) {
                uniqueString.append(temp.charAt(x));
            }
        }
        return uniqueString.length();
    }

    public static String kUniqueCharacters(String str) {
        int unique = Character.getNumericValue(str.charAt(0));

        int index = 1;
        StringBuilder temp = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        while (index < str.length()) {
            for (int x = index; x < str.length(); x++) {
                temp.append(str.charAt(x));

                if (uniqueCount(temp.toString()) > unique) {
                    x--;
                    temp.deleteCharAt(temp.length() - 1);

                    if (temp.length() > temp2.length()) {
                        temp2 = new StringBuilder(temp);
                    }
                    temp.setLength(0);
                }
            }

            if (temp.length() > temp2.length()) {
                temp2 = new StringBuilder(temp);
            }
            temp.setLength(0);
            index++;
        }

        return temp2.toString();
    }

    public static void main(String[] args) {
        System.out.println(kUniqueCharacters("3aabacbebebe")); // "cbebebe"
        System.out.println(kUniqueCharacters("2aabbcbbbadef")); // "bbcbbb"
        System.out.println(kUniqueCharacters("2aabbacbaa")); // "aabba"
    }
}
