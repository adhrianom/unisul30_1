

package principal;

import javax.swing.JOptionPane;
import model.Aluno;
public class academiaDeGinastica {

    public static void main(String[] args) {
       Aluno aluno = new Aluno();
       
       aluno.setName(JOptionPane.showInputDialog("Qual seu nome?"));
       aluno.setAge(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?")));
       aluno.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?")));
       aluno.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?")));
       JOptionPane.showMessageDialog(null, aluno);
    }
}
