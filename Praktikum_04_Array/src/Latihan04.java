import javax.swing.JOptionPane;

public class Latihan04 {
	public static void main(String[] args) {
		String out = "";
		int jumlah = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah array: ", "Input", JOptionPane.QUESTION_MESSAGE));
		int [] angka = new int [jumlah];
		int max = 0;
		
		for (int i = 0; i < jumlah; i++) {
			angka[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan angka: ", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
			out += "x[" + i + "]=" + angka[i] + "\n";
			if (max < angka[i]) {
				max = angka[i];
			}
		}
		int min = max;
		for (int j = 0; j < jumlah; j++) {
			if (angka[j] < min) {
				min = angka[j];
			}
		}
		out += "\nNilai Terbesar adalah " + max + "\n";
		out += "Nilai Terkecil adalah " + min + "\n";
		JOptionPane.showMessageDialog(null, out, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	}
}