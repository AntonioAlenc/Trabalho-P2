package DTOs;

import java.util.List;

public class CidadeDTO {
    private Long id;
    private String nome;
    private Long ufId;
    private String ufNome;
    private List<Long> enderecosIds;

    // Construtor sem parâmetros
    public CidadeDTO() {
    }

    // Construtor com parâmetros
    public CidadeDTO(Long id, String nome, Long ufId, String ufNome, List<Long> enderecosIds) {
        this.id = id;
        this.nome = nome;
        this.ufId = ufId;
        this.ufNome = ufNome;
        this.enderecosIds = enderecosIds;
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

    public Long getUfId() {
        return ufId;
    }

    public void setUfId(Long ufId) {
        this.ufId = ufId;
    }

    public String getUfNome() {
        return ufNome;
    }

    public void setUfNome(String ufNome) {
        this.ufNome = ufNome;
    }

    public List<Long> getEnderecosIds() {
        return enderecosIds;
    }

    public void setEnderecosIds(List<Long> enderecosIds) {
        this.enderecosIds = enderecosIds;
    }
}
