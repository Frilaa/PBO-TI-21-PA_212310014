import javax.swing.JOptionPane;

public class Latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Jumlah Array:"));
		int jumlah[] = new int[x];
		int angka[] = new int[x];
		
		for (int i = 0; i < jumlah.length; i++) {
			angka[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Angka:", "Data Array ke-" + i, JOptionPane.QUESTION_MESSAGE));
			
		}
		String output = "";
		for (int i = 0; i < jumlah.length; i++) {
			output += "Angka ["+i+"]" + " = " + angka[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, output, "Output Array", JOptionPane.INFORMATION_MESSAGE);
	}

}
