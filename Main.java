public class Main{
    public static void main(String[] args){
        //Scanner cc = new Scanner(System.in);

        /*System.out.println("==== Crie sua conta no Facebook ====");
        System.out.println("Digite o url:");
        Sy0stem.out.println("Digite o usuario:");
        System.out.println("Digite a senha:");
*/
        ContaFacebook cnt = new ContaFacebook("teste", "toto", "12");
        System.out.println(cnt.toString());

        cnt.setPsw(cnt.getPsw(), "novaSenha");
        System.out.println(cnt.toString());
        
    }
}