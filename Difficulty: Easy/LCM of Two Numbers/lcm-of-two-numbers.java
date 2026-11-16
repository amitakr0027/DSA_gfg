class Solution {
	public int lcm(int a, int b) {
		// code here
		int x = a;
		int y = b;
		
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		int gcd = x;
		
		return (a / gcd) * b;
	}
}
