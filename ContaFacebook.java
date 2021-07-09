public class ContaFacebook{
    private String url;
    private String usr;
    private String oldPsw;
    private String newPsw;

    public ContaFacebook(String url, String usr, String oldPsw){
        this.url = url;
        this.usr = usr;
        this.oldPsw = oldPsw;
    }

    public ContaFacebook(){}

    public String getUrl(){
        return url;
    }

    public String getUsr(){
        return usr;
    }

    public String getPsw(){
        return oldPsw;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void setUrs(String usr){
        this.usr = usr;
    }

    public void setPsw() {
        String new_psw = Teclado.leString("Informe a senha atual: ");
//        System.out.println(this.String pswgetPsw());
        if (new_psw == this.getPsw()) {
            this.newPsw = Teclado.leString("Informe a nova senha: ");
            System.out.println("A senha foi alterada com sucesso.");
        }
    }

    public String setPsw(String oldPsw, String newPsw){
        if(oldPsw == this.getPsw()){
            this.oldPsw = newPsw;
            return "Senha alterada com sucesso!";
        }
        else{
            return "A senha informada está incorreta.";
        }
    }

    public String toString(){
        String s = "URL ::: "+this.url+"\n";
        s += "Usuario ::: "+this.usr+"\n";
        s += "Senha ::: "+this.oldPsw+"\n";
        return s;
    }
}