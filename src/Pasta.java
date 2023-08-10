import java.util.List;

public class Pasta implements Component {
    private String nome;
    private List<Component> subPastas;
    private List<Component> arquivos;

    public Pasta(String nome, List<Component> subPastas, List<Component> arquivos) {
        this.nome = nome;
        this.subPastas = subPastas;
        this.arquivos = arquivos;
    }

    @Override
    public void execute() {
        if (arquivos != null) {
            for (Component arq :
                    arquivos) {
                arq.execute();
            }
        }
        if (subPastas != null) {
            for (Component subPasta :
                    subPastas) {
                subPasta.execute();
            }
        }
    }
}
