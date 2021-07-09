public class Main{
    public static void main(String[] args){
        ContaFacebook cnt = new ContaFacebook("teste", "toto", "12");
        System.out.println(cnt.toString());
        cnt.setPsw();
    }
}