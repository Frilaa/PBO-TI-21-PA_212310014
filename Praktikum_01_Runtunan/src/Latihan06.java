import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Masukkan Usia : ");
		Scanner input = new Scanner(System.in);
		String usia = input.nextLine();
		
		System.out.println("Masukkan Nama Depan : ");
		Scanner input_nama_depan = new Scanner(System.in);
		String nama_depan = input_nama_depan.nextLine();
		
		System.out.println("Masukkan Nama Belakang : ");
		Scanner input_nama_belakang = new Scanner(System.in);
		String nama_belakang = input_nama_belakang.nextLine();
		
		System.out.println("Masukkan NPM : ");
		Scanner input_npm = new Scanner(System.in);
		String npm = input_npm.nextLine();
		
		input.close();
		
		System.out.println(usia.concat(nama_depan).concat(nama_belakang).concat(npm));
	}

}
