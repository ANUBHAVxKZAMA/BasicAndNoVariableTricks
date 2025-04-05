mport java.util.*;
	class ReverseNumber {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int rev=0,lastdig;
		        for(;x>0;x/=10){
		            lastdig=x%10;
		            rev=rev*10+lastdig;
		        }
		        System.out.println("AFTER REVERSING THE NUMBER IS "+rev);		
	}
}
