package DTOs;

import java.util.List;

public class TipoPagamentoDTO {
    private Long id;
    private String nome;
    private List<Long> formasPagamentoIds;

    // Construtor sem parâmetros
    public TipoPagamentoDTO() {
    }

    // Construtor com parâmetros
    public TipoPagamentoDTO(Long id, String nome, List<Long> formasPagamentoIds) {
        this.id = id;
        this.nome = nome;
        this.formasPagamentoIds = formasPagamentoIds;
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

    public List<Long> getFormasPagamentoIds() {
        return formasPagamentoIds;
    }

    public void setFormasPagamentoIds(List<Long> formasPagamentoIds) {
        this.formasPagamentoIds = formasPagamentoIds;
    }
}
