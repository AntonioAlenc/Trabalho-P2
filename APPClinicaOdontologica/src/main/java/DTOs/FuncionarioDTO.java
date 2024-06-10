package DTOs;

import java.util.Date;
import java.util.List;

public class FuncionarioDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String sexo;
    private Long funcaoId;
    private String funcaoNome;
    private List<Long> consultasIds;
    private List<Long> agendamentosIds;

    // Construtor sem parâmetros
    public FuncionarioDTO() {
    }

    // Construtor com parâmetros
    public FuncionarioDTO(Long id, String nome, String cpf, String rg, Date dataNascimento, String telefone, String email, String sexo, Long funcaoId, String funcaoNome, List<Long> consultasIds, List<Long> agendamentosIds) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.funcaoId = funcaoId;
        this.funcaoNome = funcaoNome;
        this.consultasIds = consultasIds;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getFuncaoId() {
        return funcaoId;
    }

    public void setFuncaoId(Long funcaoId) {
        this.funcaoId = funcaoId;
    }

    public String getFuncaoNome() {
        return funcaoNome;
    }

    public void setFuncaoNome(String funcaoNome) {
        this.funcaoNome = funcaoNome;
    }

    public List<Long> getConsultasIds() {
        return consultasIds;
    }

    public void setConsultasIds(List<Long> consultasIds) {
        this.consultasIds = consultasIds;
    }

    public List<Long> getAgendamentosIds() {
        return agendamentosIds;
    }

    public void setAgendamentosIds(List<Long> agendamentosIds) {
        this.agendamentosIds = agendamentosIds;
    }
}
