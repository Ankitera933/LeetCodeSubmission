import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Convert binary strings to BigInteger
        BigInteger dec1 = BinaryToDecimal(a);
        BigInteger dec2 = BinaryToDecimal(b);
        
        // Add the two BigInteger values
        BigInteger result = dec1.add(dec2);
        
        // Convert the result back to binary and return it
        return DecimalToBinary(result);
    }

    // Convert binary string to BigInteger
    private static BigInteger BinaryToDecimal(String a) {
        return new BigInteger(a, 2);  // Base 2 indicates it's a binary string
    }

    // Convert BigInteger to binary string
    private static String DecimalToBinary(BigInteger a) {
        return a.toString(2);  // Convert to binary representation
    }
}
