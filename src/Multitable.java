import javax.xml.transform.Templates;

public class Multitable {
	
	static int temp=0;
	public  static void multiplication(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println("table of : "+ i);
			System.out.println();
			for(int j=1; j<=10;j++) {
				
				temp = i*j;
				
				System.out.println(i+ " * "+ j+ " = "+temp);
			}
			System.out.println("--------------");
			
		}
	}
public static void main(String[] args) {
	//Multitable multitable = new Multitable();
	multiplication(20);
}
}
