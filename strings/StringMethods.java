package strings;

public class StringMethods {
	public static void main(String args[]) {

		String s = "Java Training";

		// System.out.println("String length = " + s.length());
//
//   
//    System.out.println("Character at 2nd position = "
//                       + s.charAt(2));

//    System.out.println("Substring " + s.substring(3));
//
//    // Returns the substring from i to j-1 index.
//    System.out.println("Substring  = " + s.substring(2,6));

		// Concatenates string2 to the end of string1.

//    System.out.println("Concatenated string  = " +
//                        s1.concat(s2));
//
//    // Returns the index within the string
//    // of the first occurrence of the specified string.
//    
		String s4 = "Learn Share Learn";
		System.out.println("Index of Share " + s4.indexOf("Share"));
//
		Boolean out = "Java".equals("Java");
//    System.out.println("Checking Equality  " + out);
//    out = "Java".equals("JAVA");
//    System.out.println("Checking Equality  " + out);
//
		out = "JAVA".equalsIgnoreCase("Java");
		System.out.println("Checking Equality " + out);

		// If ASCII difference is zero then the two strings are similar
		String s1 = "Java"; // ASCII VALUE OF J IS 74
		String s2 = "Jor String"; //// ASCII VALUE OF F IS 70
		int out1 = s1.compareTo(s2);
		System.out.println("the difference between ASCII value is=" + out1);
		// Converting cases
		String word1 = "JavaMe";
		System.out.println("Changing to lower Case " + word1.toLowerCase());

		// Converting cases
		String word2 = "JaveeME";
		System.out.println("Changing to UPPER Case " + word2.toUpperCase());
//
		// Trimming the word
		String word4 = " Learn Share Learn ";
		System.out.println("Trim the word " + word4.trim());

	}

}
