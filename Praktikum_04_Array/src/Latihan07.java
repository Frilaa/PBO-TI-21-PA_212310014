import javax.swing.JOptionPane;

public class Latihan07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baris = 2;
		int kolom = 2;
		
		int matriksA[][] = new int [baris][kolom];
		int matriksB[][] = new int [baris][kolom];
		int hasil[][] = new int [baris][kolom];
		
		for (int i = 0; i <matriksA.length; i++) {
			for (int j = 0; j <matriksA.length; j++) {
				matriksA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan angka:", "Matriks A["+i+"]"+"["+j+"]", JOptionPane.QUESTION_MESSAGE));
			}
		}
		for (int i = 0; i <matriksB.length; i++) {
			for (int j = 0; j <matriksB.length; j++) {
				matriksB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan angka:", "Matriks B["+i+"]"+"["+j+"]", JOptionPane.QUESTION_MESSAGE));
			}
		}
		//JOptionPane.showMessageDialog(null, "Hasil");
		for (int i = 0; i < hasil.length; i++) {
			for (int j = 0; j < hasil.length; j++) {
				hasil[i][j] = matriksA[i][j] - matriksB[i][j];
			}
		}
		
		String outputA = "Matriks A: \n";
		for (int i = 0; i < matriksA.length; i++) {
			for (int j = 0; j < matriksA.length; j++) {
				outputA += matriksA[i][j] + " ";
			}
			outputA += "\n";
		}
		String outputB = "\nMatriks B: \n";
		for (int i = 0; i < matriksB.length; i++) {
			for (int j = 0; j < matriksB.length; j++) {
				outputB += matriksB[i][j] + " ";
			}
			outputB += "\n";
		}
		String output = "\nPengurangan Matriks: \n";
		for (int i = 0; i < hasil.length; i++) {
			for (int j = 0; j < hasil.length; j++) {
				output += hasil[i][j] + " ";
			}
			output += "\n";
		}
		JOptionPane.showMessageDialog(null, outputA + outputB + output);
	}

}
