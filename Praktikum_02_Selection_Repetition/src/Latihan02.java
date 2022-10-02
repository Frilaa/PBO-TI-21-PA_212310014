import java.util.Scanner;

public class Latihan02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int npm;
		
		System.out.print("Masukkan NPM : ");
		npm = input.nextInt();
		
		if (npm %2 == 1) {
			System.out.println(npm + " Termasuk bilangan Prima");
		} else {
			System.out.println(npm + " Bukan termasuk bilangan prima karna dapat dibagi dengan 2");
		}
	}

}
