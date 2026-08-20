import javax.swing.JOptionPane;
public class Exercicio1{
    static public void main (String args []){
        String entrada = JOptionPane.showInputDialog("Digite temp em celcius");
    //classe empacotadora(wrapper)
    double celcius = Double.parseDouble(entrada);
    double fahrenheit = celcius * 0.8 + 32;
    JOptionPane.showMessageDialog(
        null,
        String.format("Temp em fahrenheit: %.2f", fahrenheit)
    );
    }
}