import java.util.*;
public class LongestPalinSubstring
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		String Longpalin="";
		int maxlng=0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				String sub=str.substring(i,j+1);
				boolean ispalin=true;
				for(int k=0; k<sub.length()/2; k++) {
					if(sub.charAt(k)!=sub.charAt(sub.length()-1-k)) {
						ispalin=false;
						break;
					}
				}
				if(ispalin && sub.length()>maxlng) {
					Longpalin=sub;
					maxlng=sub.length();
				}
			}
		}
		System.out.println("Largest Palindrome SubString: "+Longpalin);
	}
}
