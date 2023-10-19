public class Navegador implements 
Iphone{

    @Override
    public String Status(Boolean status) {
        if (status == true) {
            return "ligado";
        }
        return "desligado";
    }

    @Override
    public String Iphone(String msg) {
        return "Aparelho ligado";
    }

    public String pesquisar(String pesquisa){
        return pesquisa;
    }

    public String pagina(String paginaHtml){
        return paginaHtml;
    }
    
}
