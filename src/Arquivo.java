public class Arquivo implements Component{

    private String nome;
    private Integer tamanho;

    public Arquivo(String nome, Integer tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void execute() {
        System.out.println(nome + " " + tamanho + "KB");
    }
}
