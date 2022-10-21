import javax.swing.JOptionPane;

public class Biodata {
	
	private String fullName, alamat;
	private int usia;
	
	void setData(String Nama, int Usia, String Alamat) {
		fullName = Nama;
		usia = Usia;
		alamat = Alamat;
	}
	
	void getData() {
		String output = "Biodata " + fullName + "\n\n"
					  + "Nama : " + fullName + "\n"
					  + "Usia : " + usia + " tahun\n"
					  + "Alamat : " + alamat + "\n";
		
		JOptionPane.showMessageDialog(null, output, "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
	}
	
}