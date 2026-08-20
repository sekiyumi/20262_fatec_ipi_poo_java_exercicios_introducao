import javax.swing.JOptionPane;
public class Exercicio5{
    static public void main (String args []){
        // float (4 bytes), double (8 bytes)
        float media = Float.parseFloat(
            JOptionPane.showInputDialog("Digite a media")
        );
        String situacao;
        if(media >= 6)
            situacao = "Aprovado";
        else if (media >= 4)
            situacao = "Recuperação";
        else
            situacao = "Reprovado";
        JOptionPane.showMessageDialog(
            null,
            "O aluno esta: " + situacao
        );
    }
}