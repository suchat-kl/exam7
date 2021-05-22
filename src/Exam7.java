
public class Exam7 {
	public static void main(String[] args) {
		String string1 = "You and Me", string2 = "you and me", str3 = "0123456789";
		// 1
		System.out.println(string1 + " is equal to " + string2 + " is  " + string1.equals(string2));
		// 2
		System.out
				.println("found 'Me' in '" + string1 + "' at position " + string1.indexOf("Me", string1.length() - 3));
		// 3
		System.out.println(string2 + " length is " + string2.length());
		// 4
		System.out.println("sub string 1-4 " + str3 + " is " + str3.substring(1, 5));
		// 5
		System.out.println(" ' trim this string  '  is " + "'" + " trim this string  ".trim() + "'");
		// 6
		System.out.println(" ' change to upper  '  is " + "'" + " change to upper  ".trim().toUpperCase() + "'");
		// 7
		System.out.println(string2 + " trim & to upper is " + string2.trim().toUpperCase());

	}
}
