package DTOs;

import java.util.List;

public class UFDTO {
    private Long id;
    private String descricao;
    private List<Long> cidadesIds;

    // Construtor sem parâmetros
    public UFDTO() {
    }

    // Construtor com parâmetros
    public UFDTO(Long id, String descricao, List<Long> cidadesIds) {
        this.id = id;
        this.descricao = descricao;
        this.cidadesIds = cidadesIds;
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

    public List<Long> getCidadesIds() {
        return cidadesIds;
    }

    public void setCidadesIds(List<Long> cidadesIds) {
        this.cidadesIds = cidadesIds;
    }
}
