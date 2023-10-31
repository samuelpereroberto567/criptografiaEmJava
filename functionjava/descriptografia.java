package functionjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class descriptografia {
       public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        System.out.print("Digite a mensagem criptografada: ");
        String mensagemCriptografada = output.nextLine();
        String mensagemOriginal = descriptografar(mensagemCriptografada);
        System.out.println("Mensagem original: " + mensagemOriginal);
        output.close();
    }

    private static final Map<Character, Character> tabelaCifra;

    static {
        tabelaCifra = new HashMap<>();
        tabelaCifra.put('z', 'a');
        tabelaCifra.put('y', 'b');
        tabelaCifra.put('x', 'c');
        tabelaCifra.put('w', 'd');
        tabelaCifra.put('v', 'e');
        tabelaCifra.put('u', 'f');
        tabelaCifra.put('t', 'g');
        tabelaCifra.put('s', 'h');
        tabelaCifra.put('r', 'i');
        tabelaCifra.put('q', 'j');
        tabelaCifra.put('p', 'k');
        tabelaCifra.put('o', 'l');
        tabelaCifra.put('n', 'm');
        tabelaCifra.put('m', 'n');
        tabelaCifra.put('l', 'o');
        tabelaCifra.put('k', 'p');
        tabelaCifra.put('j', 'q');
        tabelaCifra.put('i', 'r');
        tabelaCifra.put('h', 's');
        tabelaCifra.put('g', 't');
        tabelaCifra.put('f', 'u');
        tabelaCifra.put('e', 'v');
        tabelaCifra.put('d', 'w');
        tabelaCifra.put('c', 'x');
        tabelaCifra.put('b', 'y');
        tabelaCifra.put('a', 'z');
    }

    public static String descriptografar(String mensagemCriptografada) {
        StringBuilder mensagemOriginal = new StringBuilder();

        for (int i = 0; i < mensagemCriptografada.length(); i++) {
            char caractere = mensagemCriptografada.charAt(i);
            char caractereOriginal = tabelaCifra.getOrDefault(caractere, caractere);
            mensagemOriginal.append(caractereOriginal);
        }
  
        return mensagemOriginal.toString();
    }
}
