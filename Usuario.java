public class Usuario extends Pessoa {

    private Pessoa amigos[];

    public Usuario() {
        super();
        amigos = new Pessoa[1000];
    }

    public String getAmigos() {
        String a = "Lista de amigos: \n";
        for(int i =0; i < amigos.length; i++) {
            if(amigos[i] == null) {
                break;
            }
            a += amigos[i].getNome() + " Idade: "+ amigos[i].getIdade() + " \n";
        }
        return a;
    }

    public void addAmigo(Pessoa amigo) {
        for(int i =0; i < amigos.length; i++) {
            if(amigos[i] == null) {
                amigos[i] = amigo;
                return;
            }
        }
    }

    public String toString() {
        String a = "";
        for(int i =0; i < amigos.length; i++) {
            if(amigos[i] == null) {
                break;
            }
            a += amigos[i].getNome() + " Idade: "+ amigos[i].getIdade() + " \n";
        }

        return a;
    }
}
