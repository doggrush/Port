package testes_aula;

import javax.swing.JOptionPane;

public class teste_nomes {

    public static void main(String[] args) {
        comando();
        }
    
    public static void comando() {
        String nome_completo = JOptionPane.showInputDialog("Digite seu nome completo abaixo.");
        String idade = JOptionPane.showInputDialog("Digite sua idade abaixo.");
        String CPF = JOptionPane.showInputDialog("Digite seu CPF abaixo");
        int dados = JOptionPane.showConfirmDialog(null, "Estes são seus dados?" + System.lineSeparator() + nome_completo + System.lineSeparator() + idade + " Anos" + System.lineSeparator() + CPF, "Verifique seus dados", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (dados == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Parabens! " + System.lineSeparator() + "Sua conta foi cadastrada com estes dados.", "Conta cadastrada com sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Verifique quais dados estão incorretos e tente novamente", "Algo deu de errado!", JOptionPane.ERROR_MESSAGE);
        comando();
        }

    }

}
