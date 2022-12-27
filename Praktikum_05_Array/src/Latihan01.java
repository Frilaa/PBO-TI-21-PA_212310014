import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan01 {
    
    public static void main(String[] args) {
        Latihan01 mainApps = new Latihan01();

        ArrayList<ArrayList<Integer>> matriksA = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> matriksB = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < 2; i++) {
            matriksA.add(new ArrayList<Integer>());
            for(int j = 0; j < 2; j++) {
                String values_matriksA = JOptionPane.showInputDialog(null,
                                          "Masukkan angka:",
                                          "Matriks A[" + i + "][" + j + "]",
                                          JOptionPane.QUESTION_MESSAGE);
                matriksA.get(i).add(j, Integer.parseInt(values_matriksA));
            }
        }

        for(int x = 0; x < 2; x++) {
            matriksB.add(new ArrayList<Integer>());
            for(int y = 0; y < 2; y++) {
                String values_matriksB = JOptionPane.showInputDialog(null,
                                "Masukkan angka:",
                                        "Matriks B[" + x + "][" + y + "]",
                                        JOptionPane.QUESTION_MESSAGE);
                matriksB.get(x).add(y, Integer.parseInt(values_matriksB));
            }
        }

        String hasil = "Matriks A:\n" + mainApps.PrintArr(matriksA) + "\nMatriks B:\n" + mainApps.PrintArr(matriksB);

        JOptionPane.showMessageDialog(null, hasil);

    }

    private String PrintArr(ArrayList<ArrayList<Integer>> val) {
        String output = "";

        for(int i = 0; i < val.size(); i++) {
            for(int j = 0; j < val.size(); j++) {
                output += val.get(i).get(j) + " ";
            }
            output += "\n";
        }

        return output;
    }

}