package gitpackage;

public class OmittingStrings {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hi";
		String s = minCat("Hello", "Hi");
		System.out.println(s);
	}

	public static String minCat(String a, String b) {

		if (a.length() == b.length())

			return a + b;

		if (a.length() > b.length()) {

			int diff = a.length() - b.length();

			return a.substring(diff, a.length()) + b;

		} else {

			int diff = b.length() - a.length();

			return a + b.substring(diff, b.length());

		}

	}

}
