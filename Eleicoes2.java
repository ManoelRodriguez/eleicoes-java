package teste;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Manoel Rodriguez
 */
public class Eleicoes2 {

    public static void main(String[] args) {

        /**
         * VETOR DOS CANDIDATOS 
         * 0.Bolsonaro 
         * 1.Haddad
         * 2.Marina 
         * 3.Cabo Daciolo
         * 4.Amoedo 
         * 5.Meirelles 
         * 6.Boullos
         * 7.Geraldo 8.Alvaro
         */
        int vet[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        int usuario, retorno;

        usuario = Integer.parseInt(JOptionPane.showInputDialog(null, " [1] Votar\n"
                + " [2] Encerrar o programa\n"
                + " [3] Apuração dos Votos"));

        while (usuario == 1 || usuario == 3) {
            if (usuario == 1) {
                retorno = voto(vet);
                switch (retorno) {
                    case 17:
                        vet[0]++;
                        break;
                    case 13:
                        vet[1]++;
                        break;
                    case 18:
                        vet[2]++;
                        break;
                    case 51:
                        vet[3]++;
                        break;
                    case 30:
                        vet[4]++;
                        break;
                    case 15:
                        vet[5]++;
                        break;
                    case 50:
                        vet[6]++;
                        break;
                    case 45:
                        vet[7]++;
                        break;
                    case 19:
                        vet[8]++;
                        break;
                    default:
                        break;
                }
            } else if (usuario == 3) {
                apurar(vet);
            }
            usuario = Integer.parseInt(JOptionPane.showInputDialog(null, " [1] Votar Novamente\n"
                    + " [2] Ecerrar Votação\n"
                    + " [3] Apuração dos Votos"));

        }
        JOptionPane.showMessageDialog(null, "Votação Encerrada");
        
        memoria();
        
     
    }

    public static int voto(int vetor[]) {
        Scanner leitor = new Scanner(System.in);

        int votacao;
        votacao = Integer.parseInt(JOptionPane.showInputDialog(null, "[17] Jair Bolsonaro\n"
                + "[13] Fernando Haddad\n"
                + "[18] Marina Silva\n"
                + "[51] Cabo Daciolo\n"
                + "[30] Amôedo\n"
                + "[15] Meirelles\n"
                + "[50] Boullos\n"
                + "[45] Geraldo Alckmin\n"
                + "[19] Alvaro Dias"));

        switch (votacao) {
            case 17:
                JOptionPane.showMessageDialog(null, "Jair Bolsonaro");
                 break;
            case 13:
                JOptionPane.showMessageDialog(null, "Fernando Haddad");
                break;
            case 18:
                JOptionPane.showMessageDialog(null, "Marina Silva");
                break;
            case 51:
                JOptionPane.showMessageDialog(null, "Cabo Daciolo");
                break;
            case 30:
                JOptionPane.showMessageDialog(null, "Amôedo");
                break;
            case 15:
                JOptionPane.showMessageDialog(null, "Meirelles");
                break;
            case 50:
                JOptionPane.showMessageDialog(null, "Boullos");
                break;
            case 45:
                JOptionPane.showMessageDialog(null, "Geraldo Alckmin");
                break;
            case 19:
                JOptionPane.showMessageDialog(null, "Alvaro Dias");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Candidato Inexistente");
                break;
        }
        return votacao;
    }

    public static void apurar(int vetor[]) {

        JOptionPane.showMessageDialog(null, "Jair Bolsonaro: " + vetor[0] + "\n"
                + "Fernando Haddad: " + vetor[1] + "\n"
                + "Marina Silva:" + vetor[2] + "\n"
                + "Cabo Daciolo:" + vetor[3] + "\n"
                + "Amoêdo: " + vetor[4] + "\n"
                + "Meirelles: " + vetor[5] + "\n"
                + "Boullos: " + vetor[6] + "\n"
                + "Geraldo Alckmin: " + vetor[7] + "\n"
                + "Alvaro Dias: " + vetor[8]);
    }
    public static void memoria(){
        Runtime rt = Runtime.getRuntime();
        System.out.println("Memória livre " + rt.freeMemory());
        System.out.println("Máximo memória: " + rt.maxMemory());
        System.out.println("Número de processadores: " + rt.availableProcessors());
    }
    
}