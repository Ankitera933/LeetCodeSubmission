class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0"; // Handle edge case for zero multiplication
        }

        int n1 = num1.length();
        int n2 = num2.length();
        int[] product = new int[n1 + n2]; // Array to store the multiplication result

        // Multiply each digit of num1 by each digit of num2
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + product[i + j + 1]; // Add to the current position
                product[i + j + 1] = sum % 10; // Store current digit
                product[i + j] += sum / 10; // Carry to the next position
            }
        }

        // Convert the product array to a string
        StringBuilder result = new StringBuilder();
        for (int num : product) {
            if (!(result.length() == 0 && num == 0)) { // Skip leading zeros
                result.append(num);
            }
        }

        return result.toString();
    }
}
