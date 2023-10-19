public class Reprodutor implements Iphone{

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
    
    public String playList(String musica){
        return musica;
    }

    public int volume(int valor){
        if (valor <=100) {
            return valor;
        }
        return 0;
    }
}
