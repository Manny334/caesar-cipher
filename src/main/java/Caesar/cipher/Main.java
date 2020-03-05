package Caesar.cipher;

public class Main {
	public static void main(String[] args)
	{
		String message = "how are you doing today";
		int offset = 12;
		
		CaesarCipher caesarCipher = new CaesarCipher();
		String cipheredMessage = caesarCipher.cipher(message, offset);
		
		System.out.println("Original message: "+ message);
		System.out.println("Our offset: "+ offset);
		System.out.println("Ciphered Message: "+ cipheredMessage);
	}
}
