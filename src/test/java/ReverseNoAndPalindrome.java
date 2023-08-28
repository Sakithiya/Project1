
public class ReverseNoAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse
		int i=0,j=0,a;
		int n=12345;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
		//palindrome
		if(j==n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
