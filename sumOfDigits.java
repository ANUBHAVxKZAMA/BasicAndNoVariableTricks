import java.util.*;
	class sumOfDigits {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int sum=0;
		        for(;x>0;x/=10)
		           sum+=x%10;
		        System.out.println("SUM OF DIGITS IN THE GIVEN NUMBER IS "+sum);		
	}
}
