

public class MinhaClasse {

    public static void main (String [] args) {
        //int numerum = 1;
        //System.out.print ("Olá marcos");
        String primeiroNome = "Marcos";
        String segundoNome = "coelho";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    } 
}
