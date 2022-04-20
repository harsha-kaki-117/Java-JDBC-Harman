package basics;

public class DemoProgram {

	public static void main(String[] args) {
		
		//if statement
		int i=10;
		if(i%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		//ternary operator
		int m=i%2==0?3919:71220;
		System.out.println(m);
		
		//Iterative statement
		String M="K";
		switch(M)
		{
		case "H":
			System.out.println("Harsha");
			break;
		case "V":
			System.out.println("Vardhan");
			break;
		default:
			System.out.println("not match");
			
		}
	}
}
