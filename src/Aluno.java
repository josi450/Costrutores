public class Aluno {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    // Construtor
    public Aluno(String n, String c, String dn) {
        this.nome = n;
        this.cpf = c;
        this.dataDeNascimento = dn;
    }

  
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }

    public void setDataDeNascimento(String dn) {
        this.dataDeNascimento = dn;
    }
}
    
    