
public class BlockTest {

	public static void main(String args[]) {
		int x,y;
		y=20;
		
		for(x=0;x<10;x++) {
			System.out.println("X is: "+x);
			System.out.println("Y is: "+y);
			y=y-2;
		}
	}
}

/*output is :


X is: 0
Y is: 20
X is: 1
Y is: 18
X is: 2
Y is: 16
X is: 3
Y is: 14
X is: 4
Y is: 12
X is: 5
Y is: 10
X is: 6
Y is: 8
X is: 7
Y is: 6
X is: 8
Y is: 4
X is: 9
Y is: 2

*/