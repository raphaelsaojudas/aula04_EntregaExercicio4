import javax.swing.JOptionPane;

public class Aula04Ex4{
	public static void main (String args[]){
		int numero;
		int quantidade = 0;
		do{
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
         if (numero >= 100 && numero <= 200) {
            quantidade++;
         }  
		}while(numero>0);
		JOptionPane.showMessageDialog(null,"Quantidade de números digitados entre 100 e 200 é: " + quantidade);
	}
}