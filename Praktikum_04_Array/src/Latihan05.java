import javax.swing.JOptionPane;

public class Latihan05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String out = "";
		String field [] = {"Nama Lengkap: ", "Alamat: ", "No.telp: "};
		String isi [] = {"", "", ""};
		
		for (int i = 0; i < field.length; i++) {
			String in = JOptionPane.showInputDialog(null, field[i], "Data Array ke-" + i, JOptionPane.QUESTION_MESSAGE);
			isi[i] = in + "\n";
			out += field[i] + isi[i];
		}
		JOptionPane.showMessageDialog(null, out, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	}

}
