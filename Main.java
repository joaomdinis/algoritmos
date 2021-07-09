public class Main{
    public static void main(String[] args){
        ContaFacebook cnt = new ContaFacebook("teste", "toto", "12");
        System.out.println(cnt.toString());
        cnt.setPsw();

        Pessoa p1 = new Pessoa("Fulano", 18);
        Pessoa p2 = new Pessoa("Tal", 21);

        Usuario u1 = new Usuario();
        u1.addAmigo(p1);
        u1.addAmigo(p2);

        System.out.println(u1.getAmigos());
    }
}