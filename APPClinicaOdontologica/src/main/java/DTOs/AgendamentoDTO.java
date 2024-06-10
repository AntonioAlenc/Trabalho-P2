package DTOs;

import java.util.Date;

public class AgendamentoDTO {
    private Long id;
    private Date dataHora;
    private String observacao;
    private Long pacienteId;
    private String pacienteNome;
    private Long funcionarioId;
    private String funcionarioNome;

    // Construtor sem parâmetros
    public AgendamentoDTO() {
    }

    // Construtor com parâmetros
    public AgendamentoDTO(Long id, Date dataHora, String observacao, Long pacienteId, String pacienteNome, Long funcionarioId, String funcionarioNome) {
        this.id = id;
        this.dataHora = dataHora;
        this.observacao = observacao;
        this.pacienteId = pacienteId;
        this.pacienteNome = pacienteNome;
        this.funcionarioId = funcionarioId;
        this.funcionarioNome = funcionarioNome;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String pacienteNome) {
        this.pacienteNome = pacienteNome;
    }

    public Long getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Long funcionarioId) {
        this.funcionarioId = funcionarioId;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }
}
