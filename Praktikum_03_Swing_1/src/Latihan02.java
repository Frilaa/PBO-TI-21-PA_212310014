

import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		String nama = JOptionPane.showInputDialog(null, "Masukkan Nama Lengkap Anda", "Form Input Nama", JOptionPane.QUESTION_MESSAGE);
		String usia = JOptionPane.showInputDialog(null, "Masukkan Usia Anda", "Form Input Usia", JOptionPane.QUESTION_MESSAGE);
		String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat Anda", "Form Input Alamat", JOptionPane.QUESTION_MESSAGE);
		
		int Usia = Integer.parseInt(usia);
		
		bio.setData(nama, Usia, alamat);
		bio.getData();
	}
	
}