package livetardedes6ques3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class LiveTardeDes6Ques3 {

    /**
     * Escrever um algoritmo que lê 10 valores, um de cada vez, e conta 
     * quantos deles estão no intervalo [10,20] e quantos deles estão 
     * fora do intervalo, escrevendo estas informações.
     */
    public static void main(String[] args) {
        int cont, num, contDentro, contFora;
        contDentro = 0;
        contFora = 0; cont=1;
        while(cont <= 10){
            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um nº"));
            if(num>=10 && num<=20){
                contDentro++;
            }else{
                contFora++;
            }//fim do if
            cont++;
        }//fim do loop
        JOptionPane.showMessageDialog(null,"No intervalo de  [10,20] "
                + "existem: "+contDentro+" e fora deste intervalo "
                + "existem: "+contFora,"Resultados",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
