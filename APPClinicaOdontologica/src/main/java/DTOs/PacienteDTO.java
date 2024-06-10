package DTOs;

import java.util.Date;
import java.util.List;

public class PacienteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String sexo;
    private String telefone;
    private String email;
    private String senha;
    private String observacoes;
    private List<Long> enderecosIds;
    private List<Long> contatosIds;
    private List<Long> agendamentosIds;

    // Construtor sem parâmetros
    public PacienteDTO() {
    }

    // Construtor com parâmetros
    public PacienteDTO(Long id, String nome, String cpf, Date dataNascimento, String sexo, String telefone, String email, String senha, String observacoes, List<Long> enderecosIds, List<Long> contatosIds, List<Long> agendamentosIds) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.observacoes = observacoes;
        this.enderecosIds = enderecosIds;
        this.contatosIds = contatosIds;
        this.agendamentosIds = agendamentosIds;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<Long> getEnderecosIds() {
        return enderecosIds;
    }

    public void setEnderecosIds(List<Long> enderecosIds) {
        this.enderecosIds = enderecosIds;
    }

    public List<Long> getContatosIds() {
        return contatosIds;
    }

    public void setContatosIds(List<Long> contatosIds) {
        this.contatosIds = contatosIds;
    }

    public List<Long> getAgendamentosIds() {
        return agendamentosIds;
    }

    public void setAgendamentosIds(List<Long> agendamentosIds) {
        this.agendamentosIds = agendamentosIds;
    }
}
