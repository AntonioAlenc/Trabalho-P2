package DTOs;

import java.util.List;

public class TipoContatoDTO {
    private Long id;
    private String nome;
    private List<Long> contatosIds;

    // Construtor sem parâmetros
    public TipoContatoDTO() {
    }

    // Construtor com parâmetros
    public TipoContatoDTO(Long id, String nome, List<Long> contatosIds) {
        this.id = id;
        this.nome = nome;
        this.contatosIds = contatosIds;
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

    public List<Long> getContatosIds() {
        return contatosIds;
    }

    public void setContatosIds(List<Long> contatosIds) {
        this.contatosIds = contatosIds;
    }
}
