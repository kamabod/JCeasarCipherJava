
public class Cipher {

	public String encrypt(String plainText, int offset) {

		final int alphabetSize = 26;
		final int letterA = 65;
		final int lettera = 97;

		String encodedText = "";

		char[] plainTextArray = plainText.toCharArray();

		for (int i = 0; i < plainTextArray.length; i++) {

			int numericalVal = (int) plainTextArray[i];

			if (Character.isUpperCase(plainTextArray[i])) {

				System.out.println(numericalVal);

				encodedText = encodedText + (char) (((numericalVal + offset - letterA) % alphabetSize) + letterA);
			} else if (numericalVal == 32) { 
				encodedText = encodedText + plainTextArray[i];
			} else {
				encodedText = encodedText + (char) (((numericalVal + offset - lettera) % alphabetSize) + lettera);
			}

		}
		System.out.println(encodedText);
		return encodedText;
	}

	public String decrypt(String encodedText, int offset) {

		return this.encrypt(encodedText, -offset);
	}
}
