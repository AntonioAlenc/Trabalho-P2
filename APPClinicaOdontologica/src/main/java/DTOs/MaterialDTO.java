package DTOs;

import java.util.List;

public class MaterialDTO {
    private Long id;
    private String codigo;
    private String nome;
    private String tipo;
    private String descricao;
    private Long funcionarioId;
    private List<Long> consultasIds;

    // Construtor sem parâmetros
    public MaterialDTO() {
    }

    // Construtor com parâmetros
    public MaterialDTO(Long id, String codigo, String nome, String tipo, String descricao, Long funcionarioId, List<Long> consultasIds) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.funcionarioId = funcionarioId;
        this.consultasIds = consultasIds;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public List<Long> getConsultasIds() {
        return consultasIds;
    }

    public void setConsultasIds(List<Long> consultasIds) {
        this.consultasIds = consultasIds;
    }
}
