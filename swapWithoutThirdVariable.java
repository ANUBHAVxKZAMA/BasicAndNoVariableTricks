import java.util.*;
	class SwapWithoutThirdVariable {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER 1ST NUMBER:");
		        int x=sc.nextInt();
		        System.out.println("ENTER 2ND NUMBER:");
		        int y=sc.nextInt();
		        x+=y;
		        y=x-y;
		        x-=y;
		        System.out.println("AFTER SWAPPING THE NUMBERS ARE "+x+" AND " +y);		
	}
}
