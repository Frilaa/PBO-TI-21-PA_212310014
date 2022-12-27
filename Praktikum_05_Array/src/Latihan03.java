import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan03 {
    
    public static ArrayList<String> id = new ArrayList<String>();

    public static void main(String[] args) {
        id.add("Nama Lengkap");
        id.add("Alamat");
        id.add("No. Telp");

        ArrayList<ArrayList<String>> id_values = new ArrayList<ArrayList<String>>();

        for(int i = 0; i < id.size(); i++) {
            id_values.add(new ArrayList<String>());
            for(int j = 0; j < id.size(); j++) {
                String values = JOptionPane.showInputDialog(null,
                                "Masukkan " + id.get(j) + ":",
                                "Data input ke - " + i,
                                JOptionPane.QUESTION_MESSAGE);
                id_values.get(i).add(j, values);
            }
        }

        String data = PrintArr(id_values);

        JOptionPane.showMessageDialog(null, data, "Output", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String PrintArr(ArrayList<ArrayList<String>> val) {
        String output = "";

        for(int i = 0; i < id.size(); i++) {
            for(int j = 0; j < id.size(); j++) {
                output += id.get(j) + ": " + val.get(i).get(j) + "\n";
            }
            output += "\n";
        }

        return output;
    }

}