import java.util.*;
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter String for processing:");
		String t = scan.nextLine();

		if(t.isEmpty()){
			System.out.println("Please Enter String for processing. Try Again");
		}else{
			System.out.println("Reverse of the entered string is:");
			for(int i=t.length()-1;i>=0;i--){
				System.out.print(t.toCharArray()[i]);
			}
		}
	}

}
