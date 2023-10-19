public class Telefone implements Iphone{

    @Override
    public String Iphone(String msg) {
        return "Aparelho ligado";
    }

    @Override
    public String Status(Boolean status) {
        if (status == true) {
            return "ligado";
        }
        return "desligado";
    }
    
    public int ligarTel(int numero){
        return numero;
    }

    public String pesquisarNumero(String nome, int numero){
        return nome + numero;
    }
}
