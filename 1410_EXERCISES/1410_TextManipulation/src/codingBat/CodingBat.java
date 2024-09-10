package codingBat;

public class CodingBat {
	public static String wordEnds(String str, String word) {
		StringBuilder res = new StringBuilder();
        int wLength = word.length();
        int i = 0;

        while (i < str.length()) {
            int idx = str.indexOf(word, i);
            if (idx == -1) {
                break;
            }

            if (idx > 0) {
            	// before word
                res.append(str.charAt(idx - 1));
            }

            if (idx + wLength < str.length()) {
            	// after word
                res.append(str.charAt(idx + wLength));
            }

            i = idx + wLength;
        }

        return res.toString();
	}
}
