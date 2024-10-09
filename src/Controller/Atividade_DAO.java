
package Controller;

import static View.inicio_GUI.val1_txt;
import static View.inicio_GUI.val2_txt;
import javax.swing.JOptionPane;

public class Atividade_DAO {
    
    
    public static void mais (){
    double val1 = Double.parseDouble(val1_txt.getText());
    double val2 = Double.parseDouble(val2_txt.getText());
    double soma;
    soma = val1 + val2;
    
    JOptionPane.showMessageDialog(null,"a soma dos números " + val1 + " e " + val2 + " é igual a : " + soma );
    }
    public static void menos (){
    double val1 = Double.parseDouble(val1_txt.getText());
    double val2 = Double.parseDouble(val2_txt.getText());
    double menos;
    menos = val1 - val2;
    
    JOptionPane.showMessageDialog(null,"a subtração dos números " + val1 + " e " + val2 + " é igual a : " + menos );
    }
    public static void div (){
    double val1 = Double.parseDouble(val1_txt.getText());
    double val2 = Double.parseDouble(val2_txt.getText());
    double div;
    div = val1 / val2;
    
    JOptionPane.showMessageDialog(null,"a divisão dos números " + val1 + " e " + val2 + " é igual a : " + div );
    }
    public static void mult (){
    double val1 = Double.parseDouble(val1_txt.getText());
    double val2 = Double.parseDouble(val2_txt.getText());
    double mult;
    mult = val1 * val2;
    
    JOptionPane.showMessageDialog(null,"a multiplicação dos números " + val1 + " e " + val2 + " é igual a : " + mult );
    }
    
    
}
