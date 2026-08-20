import javax.swing.JOptionPane;
public class Exercicio3{
    static public void main(String... args){
        double prova = Double.parseDouble(
            JOptionPane.showInputDialog("Nota da prova:")
        );
        double trabalho = Double.parseDouble(
            JOptionPane.showInputDialog("Nota do trabalho:")
        );

        double media = (prova * 6 + trabalho * 4) / 10;
        
        JOptionPane.showMessageDialog(
            null,
            "Média ponderada: " + media
        );
    }
}