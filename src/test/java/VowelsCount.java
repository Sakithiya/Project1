
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to java class";
		int vowels=0,nonVowels=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
				vowels++;
			}
			else {
				nonVowels++;
			}
		}
		System.out.println(vowels);
		System.out.println(nonVowels);
	}

}
