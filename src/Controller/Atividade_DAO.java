
package Controller;

import static View.inicio_GUI.val1_txt;
import static View.inicio_GUI.val2_txt;
import javax.swing.JOptionPane;

public class Atividade_DAO {
    public static double val1 = 0, val2 =0, resp =0;
    
    
    public static void mais (){
    val1 = Double.parseDouble(val1_txt.getText());
    val2 = Double.parseDouble(val2_txt.getText());
    resp = val1 + val2;
    
    JOptionPane.showMessageDialog(null,"a soma dos números " + val1 + " e " + val2 + " é igual a : " + resp );
    }
    public static void menos (){
    val1 = Double.parseDouble(val1_txt.getText());
    val2 = Double.parseDouble(val2_txt.getText());
    resp = val1 - val2;
    
    JOptionPane.showMessageDialog(null,"a subtração dos números " + val1 + " e " + val2 + " é igual a : " + resp );
    }
    public static void div (){
    val1 = Double.parseDouble(val1_txt.getText());
    val2 = Double.parseDouble(val2_txt.getText());
    resp = val1 / val2;
    
    JOptionPane.showMessageDialog(null,"a divisão dos números " + val1 + " e " + val2 + " é igual a : " + resp );
    }
    public static void mult (){
    val1 = Double.parseDouble(val1_txt.getText());
    val2 = Double.parseDouble(val2_txt.getText());
    resp = val1 * val2;
    
    JOptionPane.showMessageDialog(null,"a multiplicação dos números " + val1 + " e " + val2 + " é igual a : " + resp );
    }
    
    
}
