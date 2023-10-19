import java.util.Scanner;

public class Tela {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o tipo de interação: "
                + "\nN (Navegar) "
                + "\nR (Reprodutor) "
                + "\nT (Telefone)");

        String sele = sc.nextLine();

        if (sele.charAt(0) == 'N') {
            Navegador navegar = new Navegador();
            System.out.println(navegar.Iphone("Abrir"));
            navegar.Status(true);
            System.out.println(navegar.pagina("index"));
            String pesquisa = sc.next();
            System.out.println("Pesquisa: ");
            System.out.println(navegar.pesquisar(pesquisa));
        }
        if (sele.charAt(0) == 'R') {
            Reprodutor reprodutor = new Reprodutor();

            System.out.println(reprodutor.Iphone("Abrir"));
            reprodutor.Status(true);

            System.out.println("Pesquisar PlayList");
            String play = sc.next();
            System.out.println(reprodutor.playList(play));

            System.out.println("Valor do volume de 0 a 100");
            int volume = sc.nextInt();
            System.out.println(reprodutor.volume(volume));

        }if (sele.charAt(0) == 'T') {
            Telefone tel = new Telefone();

            System.out.println(tel.Iphone("Abrir"));
            tel.Status(true);

            System.out.println("Numero a ligar: ");
            int numero = sc.nextInt();
            System.out.println(tel.ligarTel(numero));

            System.out.println("Nome e numero a se procurar: ");
            String nome = sc.next();
            int nTele = sc.nextInt();
            System.out.println(tel.pesquisarNumero(nome, nTele));
        }else{
            System.out.println("Error");
        }
    }
}
