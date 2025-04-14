/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_26;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        for(int i = 0; i<5; i++){
            String entrada = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número inteiro:");
            numeros[i] = Integer.parseInt(entrada);
        }
        
         Arrays.sort(numeros);
         
     StringBuilder resultado = new StringBuilder("Números em ordem crescente:\n");
        for (int num : numeros) {
            resultado.append(num).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}