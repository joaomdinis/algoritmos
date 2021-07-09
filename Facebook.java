public class Facebook extends ContaFacebook {

    private ContaFacebook[] contasFacebook;

    public Facebook(int qntContas) {
        super();
        contasFacebook = new ContaFacebook[qntContas];
    }

    public boolean insereConta(ContaFacebook contaFacebook) {
        for(int i =0; i < contasFacebook.length; i++) {
            if(contasFacebook[i] == null) {
                contasFacebook[i] = contaFacebook;
                return true;
            }
        }
        return false;
    }

    public String imprimeInformacoesContas() {
        String a = "Informações Contas do Facebook: \n";
        for(int i =0; i < contasFacebook.length; i++) {
            if(contasFacebook[i] == null) {
                break;
            }
            a += contasFacebook[i].toString();
        }
        return a;
    }

    public String imprimeURLFanpages() {
        String a = "Informações de fanpages: \n";
        for(int i =0; i < contasFacebook.length; i++) {
            if(contasFacebook[i] == null) {
                break;
            }
            a += contasFacebook[i].getUrl();
        }
        return a;
    }
}
