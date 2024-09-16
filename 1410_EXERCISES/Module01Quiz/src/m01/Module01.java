package m01;

public class Module01 {
	
	/** 
	 * Returns the string passed into it.
	 * 
	 * @param word
	 * 
	 * */
	public static String transform(String word) {
		/* not sure what this method was supposed to do as the instructions in the word doc
		 * just say to have it return a string. Therefore I don't think it should even be here.
		 */
		return word;
	}

	/** 
	 * Replaces all underscores and changes casing on all letters to lower case,
	 * except the first letter of words that start with a or z. Those have the a or z upper cased.
	 * Returns a String that is the word concatenated to the reverse of the word after processing
	 * 
	 * @param str
	 * 
	 * */
	public static String methodA(String str) {
		if(str == null || str == "Null") {
			return null;
		} else if(str == "") {
			return "";
		}
		
		StringBuilder sb = new StringBuilder(str.replace("_", "").toLowerCase());
		
		if(sb.isEmpty()) {
			return "";
		};
		
		if(sb.charAt(0) == 'a') {
			sb.replace(0, 1, "A");
		}
		
		if(sb.charAt(0) == 'z') {
			sb.replace(0, 1, "Z");
		}
		
		return sb.toString() + sb.reverse().toString();
	}

	/**
	 * Counts the number of characters in a word one for one except when<br>
	 * the following combinations are present:<br>
	 *     ae<br>
	 *     au<br>
	 *     oe<br>
	 *     ue<br>
	 *     eu<br>
	 * 
	 * In these cases, the combination is counted as 1 instead of two<br>
	 * Then the count is returned as an int.
	 *  
	 *  @param word
	 *  
	 *  */
	public static int methodB(String word) {
		StringBuilder sb = new StringBuilder(word.toLowerCase());
		if(sb.length()==0) {
			return 0;
		} else if(sb.length() == 1) {
			return 1;
		}
		
		if(sb.length() > 1 
		   && sb.charAt(0) == 'a' && sb.charAt(1) == 'e'
		   || sb.charAt(0) == 'a' && sb.charAt(1) == 'u'
		   || sb.charAt(0) == 'o' && sb.charAt(1) == 'e'
		   || sb.charAt(0) == 'u' && sb.charAt(1) == 'e'
		   || sb.charAt(0) == 'e' && sb.charAt(1) == 'u'
		   ) {
			return 1 + methodB(sb.substring(2));
		} else {
			return 1 + methodB(sb.substring(1));
		}
	}
}
