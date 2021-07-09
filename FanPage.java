public class Fanpage extends ContaFacebook{
    private int nroCurtidas = 0;

    public Fanpage(String url, String usr, String oldPsw){
        super(url, usr, oldPsw);
        this.nroCurtidas = nroCurtidas;
    }

    public int getNroCurtidas(){
        return nroCurtidas;
    }

    public void setNroCurtidas(int nroCurtidas){
        this.nroCurtidas = nroCurtidas;
    }

    public int curtir(){
        this.nroCurtidas += 1;
    }

    public String toString(){
        String s = "URL ::: "+this.url+"\n";
        s += "Usuario ::: "+this.usr+"\n";
        s += "Senha ::: "+this.oldPsw+"\n";
        s += "Numero de Curtidas ::: "+this.nroCurtidas+"\n";
        return s;
    }
}