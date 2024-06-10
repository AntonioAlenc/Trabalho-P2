package DTOs;

public class EnderecoDTO {
    private Long id;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
    private Long cidadeId;
    private String cidadeNome;
    private Long pacienteId;

    // Construtor sem parâmetros
    public EnderecoDTO() {
    }

    // Construtor com parâmetros
    public EnderecoDTO(Long id, String rua, String numero, String bairro, String complemento, String cep, Long cidadeId, String cidadeNome, Long pacienteId) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidadeId = cidadeId;
        this.cidadeNome = cidadeNome;
        this.pacienteId = pacienteId;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(Long cidadeId) {
        this.cidadeId = cidadeId;
    }

    public String getCidadeNome() {
        return cidadeNome;
    }

    public void setCidadeNome(String cidadeNome) {
        this.cidadeNome = cidadeNome;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }
}
