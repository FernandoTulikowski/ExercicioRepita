/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, m = 0, c =0, d = 0, i =0, p = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            s += n;         //soma os valores informados
            if (n!=0){
                c++;    //conta a quantidade de números informados
                if (n%2 == 0){  //testa se n é par
                    p++;        //soma 1 no contador par
                }else 
                    i++;        //soma 1 no contador ímpar
                
            }
           
            if (n>100){     //testa se n é maior que 100 e soma 1 no contador d
                d++;
            }
        }while(n != 0);
        m = s/c; //calcula a média
        JOptionPane.showMessageDialog(null, "<html>Resultado Final<hr>"+
                "<br>Total de Valores: " + c + 
                "<br>Total de Pares: " + p +
                "<br>Total de Ímpares: " + i +
                "<br>Acima de 100: " + d +
                "<br>Média dos Valores: " + m + "</html>");
    }
    
}
