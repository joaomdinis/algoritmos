public class Main{
    public static void main(String[] args){
<<<<<<< HEAD
//        ContaFacebook cnt = new ContaFacebook("teste", "toto", "12");
//        System.out.println(cnt.toString());
//        cnt.setPsw();

        Pessoa p1 = new Pessoa("Fulano", 18);
        Pessoa p2 = new Pessoa("Tal", 21);

        Usuario u1 = new Usuario();
        u1.insereAmigo(p1);
        u1.insereAmigo(p2);

        System.out.println(u1.getAmigos());
=======
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
        
>>>>>>> 93323302ed72e44443fdbdee5792ad337d061f5a
    }
}