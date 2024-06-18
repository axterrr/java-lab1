import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class HashingTest {

    public void testMessageDigest(String message) throws NoSuchAlgorithmException {
        System.out.println("MessageDigest test:");
        System.out.println("MD5: " + messageDigestHashMessage("MD5", message));
        System.out.println("SHA-1: " + messageDigestHashMessage("SHA-1", message));
        System.out.println("SHA-256: " + messageDigestHashMessage("SHA-256", message));
    }

    private static String messageDigestHashMessage(String algorithm, String message) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(algorithm);
        byte[] bytesHash = digest.digest(message.getBytes());
        return bytesToHash(bytesHash);
    }

    public void testSecureRandom(String message) throws NoSuchAlgorithmException {
        System.out.println("SecureRandom test:");
        System.out.println("SHA1PRNG: " + secureRandomHashMessage("SHA1PRNG", message));
        System.out.println("DRBG: " + secureRandomHashMessage("DRBG", message));
    }

    private static String secureRandomHashMessage(String algorithm, String message) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = SecureRandom.getInstance(algorithm);
        secureRandom.setSeed(message.getBytes());
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);
        return bytesToHash(salt);
    }

    private static String bytesToHash(byte[] bytesHash) {
        StringBuilder res = new StringBuilder();
        for (byte b : bytesHash)
            res.append(String.format("%02x", b));
        return res.toString();
    }
}
