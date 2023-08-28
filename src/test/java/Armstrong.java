
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,a;
		int n=153;
		a=n;
		while(a>0) {
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		System.out.println(j);
	}

}
