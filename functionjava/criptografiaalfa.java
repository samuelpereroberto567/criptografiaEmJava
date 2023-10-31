package functionjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class criptografiaalfa {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
         System.out.print("Digite uma mensagem: ");
         String mensagemOriginal = output.nextLine();
                String mensagemCriptografada = criptografar(mensagemOriginal);
             System.out.println("Mensagem criptografada: " + mensagemCriptografada);
             output.close(); }
       
      private static final Map<Character, Character> tabelaCifra;
 
         static {
             tabelaCifra = new HashMap<>();
             tabelaCifra.put('a', 'z');
             tabelaCifra.put('b', 'y');
             tabelaCifra.put('c', 'x');
             tabelaCifra.put('d', 'w');
             tabelaCifra.put('e', 'v');
             tabelaCifra.put('f', 'u');
             tabelaCifra.put('g', 't');
             tabelaCifra.put('h', 's');
             tabelaCifra.put('i', 'r');
             tabelaCifra.put('j', 'q');
             tabelaCifra.put('k', 'p');
             tabelaCifra.put('l', 'o');
             tabelaCifra.put('m', 'n');
             tabelaCifra.put('n', 'm');
             tabelaCifra.put('o', 'l');
             tabelaCifra.put('p', 'k');
             tabelaCifra.put('q', 'j');
             tabelaCifra.put('r', 'i');
             tabelaCifra.put('s', 'h');
             tabelaCifra.put('t', 'g');
             tabelaCifra.put('u', 'f');
             tabelaCifra.put('v', 'e');
             tabelaCifra.put('w', 'd');
             tabelaCifra.put('x', 'c');
             tabelaCifra.put('y', 'b');
             tabelaCifra.put('z', 'a');
         }
 
         public static String criptografar(String mensagem) {
             StringBuilder mensagemCriptografada = new StringBuilder();
 
             for (int i = 0; i < mensagem.length(); i++) {
                 char caractere = mensagem.charAt(i);
                 char caractereCriptografado = tabelaCifra.getOrDefault(caractere, caractere);
                 mensagemCriptografada.append(caractereCriptografado);
             }
 
             return mensagemCriptografada.toString();
         
             
       
         }
}
