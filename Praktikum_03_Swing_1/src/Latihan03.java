

import javax.swing.JOptionPane;

public class Latihan03 {

	public static void main(String[] args) {
		Biodata bio = new Biodata();
		
		final String WARN = "PERINGATAN!";
		
		String nama = JOptionPane.showInputDialog(null, "Masukkan Nama Lengkap Anda", "Form Input Nama", JOptionPane.QUESTION_MESSAGE);
		
		if(nama.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field Form Nama Tidak Boleh Kosong!", WARN, JOptionPane.WARNING_MESSAGE);
			System.exit(0);
		}
		
		
		String usia = JOptionPane.showInputDialog(null, "Masukkan Usia Anda", "Form Input Usia", JOptionPane.QUESTION_MESSAGE);
		final String REG_NUMERIK = "[0-9]+";
		
		if(usia.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field Form Usia Tidak Boleh Kosong!", WARN, JOptionPane.WARNING_MESSAGE);
		} else if(!usia.matches(REG_NUMERIK)) {
			JOptionPane.showMessageDialog(null, "Isian Form Usia Harus Numerik!", WARN, JOptionPane.WARNING_MESSAGE);
		}
		
		
		String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat Anda", "Form Input Alamat", JOptionPane.QUESTION_MESSAGE);
		
		if(alamat.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Field Form Alamat Tidak Boleh Kosong!", WARN, JOptionPane.WARNING_MESSAGE);
		} else if(alamat.length() < 10) {
			JOptionPane.showMessageDialog(null, "Masukkan Alamat minimum 10 karakter!", WARN, JOptionPane.WARNING_MESSAGE);
		}
		
		int Usia = Integer.parseInt(usia);
		
		bio.setData(nama, Usia, alamat);
		bio.getData();
	}
	
}