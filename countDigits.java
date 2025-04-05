import java.util.*;
	class CountDigits {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int count=0;
		        for(;x>0;x/=10)
		           count++;
		        System.out.println("NUMBER OF DIGITS IN THE GIVEN NUMBER IS "+count);		
	}
}
