import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Se
        //compararmos duas cadeias de DNA e contarmos as diferenças entre elas, podemos ver quantos
        //erros ocorreram. Isso é conhecido como "Distância de Hamming".
        //Lemos o DNA usando as letras C,A,G e T. Duas fitas podem se parecer com isso:
        //GAGCCTACTAACGGGAT
        //CATCGTAATGACGGCCT
        //^ ^ ^  ^ ^    ^ ^
        //Eles têm 7 diferenças e, portanto, a distância de Hamming é 7.



        String dna1 = "GAGCCTACTAACGGGAT";
        String dna2 = "CATCGTAATGACGGCCT";

        int distanciaHamming = 0;

        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                distanciaHamming++;
            }
        }

        JOptionPane.showMessageDialog(null, "****** Distância de Hamming *******\nResultado = " + distanciaHamming);


    }
}
