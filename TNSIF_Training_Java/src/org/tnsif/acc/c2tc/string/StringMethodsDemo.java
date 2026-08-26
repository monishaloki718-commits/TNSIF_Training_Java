package org.tnsif.acc.c2tc.string;

public class StringMethodsDemo {

	public static void main(String[] args) {
        // Initialize a string for demonstration
        String str = "   Hello, World!   ";

        // 1. length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt(int index)
        char charAtIndex5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        // 3. substring(int beginIndex)
        String substringFrom7 = str.substring(7);
        System.out.println("Substring from index 7: " + substringFrom7);

        // 4. substring(int beginIndex, int endIndex)
        String substringFrom7To12 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringFrom7To12);

        // 5. replace(CharSequence target, CharSequence replacement)
        String replacedString = str.replace("World", "Java");
        System.out.println("Replaced string: " + replacedString);

        // 6. toLowerCase()
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case string: " + lowerCaseStr);

        // 7. toUpperCase()
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case string: " + upperCaseStr);

        // 8. trim()
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: " + trimmedStr);

        // 9. split(String regex)
        String[] fruits = "apple,banana,cherry".split(",");
        System.out.println("Splitted strings:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. indexOf(String str)
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // 11. contains(CharSequence sequence)
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // 12. startsWith(String prefix)
        boolean startsWithSpaces = str.startsWith("   ");
        System.out.println("Starts with spaces: " + startsWithSpaces);

        // 13. endsWith(String suffix)
        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);

        // 14. valueOf(Object obj)
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("String representation of the number: " + numberStr);


	}

}
