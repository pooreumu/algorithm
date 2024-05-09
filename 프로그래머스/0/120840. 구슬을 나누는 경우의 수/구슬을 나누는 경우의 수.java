import java.math.BigInteger;

class Solution {
	public int solution(int balls, int share) {
		BigInteger result = Factorial.getFactorial(balls).divide(
			(Factorial.getFactorial(balls - share).multiply(Factorial.getFactorial(share)))
		);
		return result.intValue();
	}
}

class Factorial {
	public static BigInteger getFactorial(int n) {
		BigInteger result = BigInteger.valueOf(1L);
		BigInteger bigIntegerN = BigInteger.valueOf(n);
		for (BigInteger i = BigInteger.valueOf(1L); i.compareTo(bigIntegerN) <= 0; i = i.add(BigInteger.ONE)) {
			result = result.multiply(i);
		}
		return result;
	}
}
