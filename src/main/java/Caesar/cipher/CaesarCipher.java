package Caesar.cipher;

public class CaesarCipher {
	
	private static final char LETTER_A='a';
	private static final char LETTER_Z='z';
	private static final int ALPHABET_SIZE=26;
	
	public String cipher(String message, int offset) {
		offset %= ALPHABET_SIZE; // offset = offset % ALPHABET_SIZE
		char[] character = message.toCharArray(); // toCharArray is used to covert given string and append them to the character array
		offsetBy(character, offset);
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {
		for(int i=0;i<character.length;++i)
		{
			if(character[i] != ' ') {
			character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
		}
	}
		
	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		c += offset;
		if(c < letterA) // This method deals with left case rotation
		{
			return (char)(c + ALPHABET_SIZE);
		}
		if(c > letterZ) // This method deals with right case rotation
		{
			return (char)(c - ALPHABET_SIZE);
		}
		return c;
	}
	
}
