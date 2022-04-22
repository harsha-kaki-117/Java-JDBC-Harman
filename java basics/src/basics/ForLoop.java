package basics;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==2) {
					System.out.print('$'+' '+' '+'$');
					break;}
				else if(i==3) {
					System.out.print('$'+' '+' '+'$');
					break;}
				else;
					System.out.print('$'+" ");
			}
			System.out.println();
		}
		

	}

}
