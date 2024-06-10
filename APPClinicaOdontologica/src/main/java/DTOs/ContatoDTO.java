package DTOs;

public class ContatoDTO {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Long tipoContatoId;
    private String tipoContatoDescricao;
    private Long pacienteId;

    // Construtor sem parâmetros
    public ContatoDTO() {
    }

    // Construtor com parâmetros
    public ContatoDTO(Long id, String nome, String telefone, String email, Long tipoContatoId, String tipoContatoDescricao, Long pacienteId) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoContatoId = tipoContatoId;
        this.tipoContatoDescricao = tipoContatoDescricao;
        this.pacienteId = pacienteId;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTipoContatoId() {
        return tipoContatoId;
    }

    public void setTipoContatoId(Long tipoContatoId) {
        this.tipoContatoId = tipoContatoId;
    }

    public String getTipoContatoDescricao() {
        return tipoContatoDescricao;
    }

    public void setTipoContatoDescricao(String tipoContatoDescricao) {
        this.tipoContatoDescricao = tipoContatoDescricao;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }
}
