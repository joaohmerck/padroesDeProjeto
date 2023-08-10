import java.util.List;

public class Main {
    public static void main(String[] args) {
        var root = criaPastasComArquivos();
        root.execute();
    }


    public static Component criaPastasComArquivos() {

        var arquivoDownload1 = new Arquivo("cs-go", 100);
        var arquivoDownload2 = new Arquivo("google", 35);
        var arquivoDownload3 = new Arquivo("whatsapp", 48);

        var photo1 = new Arquivo("photo1", 12);
        var photo2 = new Arquivo("photo2", 50);

        var pasta2 = new Pasta("downloads", null, List.of(
                arquivoDownload1, arquivoDownload2, arquivoDownload3
        ));
        var pasta3 = new Pasta("photos", null, List.of(
                photo1, photo2
        ));

        var pasta1 = new Pasta("root", List.of(
                pasta2, pasta3
        ), List.of(new Arquivo("java", 10)));

        return pasta1;
    }
}