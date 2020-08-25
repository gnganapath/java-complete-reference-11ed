
public class IfSample {
	public static void main(String args[]) {
		int x,y;
		
		x=10; y=20;
		
		if( x < y ) { System.out.println("X is < Y =>"+x+y);
		
		x=x*2;
		if( x == y ) {System.out.println("X is = to Y =>"+x+y);}
		
		x=x*3;
		if( x > y )  System.out.println("X is > Y =>"+x+y);		
		
		if( y > x ) System.out.println("not able to see this");
		}
	}

}


/*output is:


X is < Y =>1020
X is = to Y =>2020
X is > Y =>6020

*/