import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {
	public static void main(String[] args) {
		String out = "";
		int jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah array: ", "Input", JOptionPane.QUESTION_MESSAGE));
		ArrayList<Integer> angka = new ArrayList<Integer>();
		int max = 0;
		
		for (int i = 0; i < jumlah; i++) {
			int isi = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan angka: ", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
			angka.add(i, isi);
			out += "x[" + i + "]=" + isi + "\n";
			if (max < isi) {
				max = isi;
			}
		}
		int min = max;
		for (int j = 0; j < jumlah; j++) {
			if (angka.get(j) < min) {
				min = angka.get(j);
			}
		}
		out += "Nilai Terbesar adalah " + max + "\n";
		out += "Nilai Terkecil adalah " + min + "\n";
		JOptionPane.showMessageDialog(null, out, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	}
}