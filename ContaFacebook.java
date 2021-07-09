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

    public int getUsr(){
        return usr;
    }

    public int getPsw(){
        return psw;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public void setUrs(String usr){
        this.usr = usr;
    }

    public void setPsw(String psw){
        this.psw = psw;
    }

    public String toString(){
        String s = "[URL] "+this.url+"\n";
        s += "[Usuário] "+this.usr+"\n";
        s += "[Senha] "+this.psw+"\n";
        return s;
    }
}