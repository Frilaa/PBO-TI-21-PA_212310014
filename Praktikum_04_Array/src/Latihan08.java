import javax.swing.JOptionPane;

public class Latihan08 {
	public static void main(String[] args) {
		int baris = 3, kolom = 4;
		int a = 0, b = 1, c = 2;
		String output = "";
		String input[][] = new String[baris][kolom];
		input[0][0] = "Nama Lengkap: ";
		input[1][0] = "Alamat: ";
		input[2][0] = "No. Telp: ";
		
		for (int i = 0; i < baris; i++) {
			output += input[i][0];
			for (int j = b; j < c; j++) {
				input[i][j] = JOptionPane.showInputDialog(null, input[i][0], "Data Array ke-[" + i + "]" + "["+ j + "]", JOptionPane.QUESTION_MESSAGE);
				output += input[i][j] + "\n";
			}
			if (i == baris - 1) {
				output += "\n";
				i = - 1;
				b = b + 1;
				c = c + 1;
				a = a + 1;
				if (a == 3) {
					i = baris;
				}
			}
		}
		JOptionPane.showMessageDialog(null, output);
	}
}
