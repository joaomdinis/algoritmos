public class ContaFacebook{
    private String url;
    private String usr;
    private String psw;

    public ContaFacebook(String url, String usr, String psw){
        this.url = url;
        this.usr = usr;
        this.psw = psw;
    }

    public String getUrl(){
        return url;
    }

    public String getUsr(){
        return usr;
    }

    public String getPsw(){
        return psw;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void setUrs(String usr){
        this.usr = usr;
    }

    public void setPsw(){
        String new_psw = Teclado.leString("Informe a senha atual: ");
        System.out.println(this.String pswgetPsw());
        if(new_psw==this.getPsw()){
            this.psw = Teclado.leString("Informe a nova senha: ");
            System.out.println("A senha foi alterada com sucesso.");
        }
        else{
            System.out.println("A senha informada está incorreta.");
        }
    }

    public String toString(){
        String s = "URL ::: "+this.url+"\n";
        s += "Usuario ::: "+this.usr+"\n";
        s += "Senha ::: "+this.psw+"\n";
        return s;
    }
}