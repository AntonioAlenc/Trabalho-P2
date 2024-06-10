package DTOs;

public class PronosticoDTO {
    private Long id;
    private String descricao;
    private Long consultaId;

    // Construtor sem parâmetros
    public PronosticoDTO() {
    }

    // Construtor com parâmetros
    public PronosticoDTO(Long id, String descricao, Long consultaId) {
        this.id = id;
        this.descricao = descricao;
        this.consultaId = consultaId;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Long consultaId) {
        this.consultaId = consultaId;
    }
}
