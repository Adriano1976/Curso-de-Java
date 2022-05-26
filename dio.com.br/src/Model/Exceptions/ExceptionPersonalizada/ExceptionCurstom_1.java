/*
— Programadores podem achar útil declarar a suas próprias classes de exceção.
— Essas Exceptions são específicas aos problemas que podem ocorrer quando outro programador
empregar a suas classes reutilizáveis.
— Uma nova classe de exceção deve estender uma classe de exceção existente que assegura que a
classe pode ser utilizada com o mecanismo de tratamento de exceções, logo essas Exceções
customizadas são derivadas da classe Exception.
— Importante: Antes de criar a nossa própria exceção, é recomendado verificar se já existe alguma exceção na biblioteca Java que já nos forneça o que precisamos. Afinal, não queremos reinventar a roda!
 */

package Model.Exceptions.ExceptionPersonalizada;

import javax.swing.*;
import java.io.*;

public class ExceptionCurstom_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Informe o nome do arquivo a ser exibido: ");

        imprimirArquivoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoConsole(String nomeDoArquivo) {

        try {
            BufferedReader bufferedReader = lerArquivo(nomeDoArquivo);
            String line = bufferedReader.readLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            } while (line != null);
            bufferedWriter.flush();
            bufferedReader.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado!\nPor favor, fale com o suporte técnico.\nErro: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório  " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
