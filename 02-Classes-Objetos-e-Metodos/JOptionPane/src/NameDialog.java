// Obtendo a entrada de usuário a partir de um diálogo.

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {

        // pede para o usuário inserir seu nome
        String name = JOptionPane.showInputDialog("Qual o seu nome? ");
        String sobreNome = JOptionPane.showInputDialog("Qual o seu sobrenome? ");

        // cria a mensagem
        String message = String.format("Seja bem vindo, %s %s, a Programação Java", name, sobreNome);

        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);
    } // fim de main
} // termina NameDialog
