package basics;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum = HarshaAdd(15,5);
		System.out.println("The sum is --"+sum);
		Object collegeStudent;
		collegeStudent.name = "abdul";
		System.out.println("Name of the student is --"+collegeStudent.name);
	}
	
	static int HarshaAdd(int fno, int sno) {
		int result = fno + sno;
		return result;
	}

}
