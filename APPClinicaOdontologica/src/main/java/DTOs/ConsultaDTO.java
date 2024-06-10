package DTOs;

import java.util.Date;
import java.util.List;

public class ConsultaDTO {
    private Long id;
    private Date dataHora;
    private String diagnostico;
    private String receituario;
    private String exames;
    private Long pacienteId;
    private String pacienteNome;
    private Long funcionarioId;
    private String funcionarioNome;
    private List<Long> materiaisIds;
    private List<Long> formasPagamentoIds;
    private List<Long> pronosticosIds;

    // Construtor sem parâmetros
    public ConsultaDTO() {
    }

    // Construtor com parâmetros
    public ConsultaDTO(Long id, Date dataHora, String diagnostico, String receituario, String exames, 
                       Long pacienteId, String pacienteNome, Long funcionarioId, String funcionarioNome, 
                       List<Long> materiaisIds, List<Long> formasPagamentoIds, List<Long> pronosticosIds) {
        this.id = id;
        this.dataHora = dataHora;
        this.diagnostico = diagnostico;
        this.receituario = receituario;
        this.exames = exames;
        this.pacienteId = pacienteId;
        this.pacienteNome = pacienteNome;
        this.funcionarioId = funcionarioId;
        this.funcionarioNome = funcionarioNome;
        this.materiaisIds = materiaisIds;
        this.formasPagamentoIds = formasPagamentoIds;
        this.pronosticosIds = pronosticosIds;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
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

    public List<Long> getMateriaisIds() {
        return materiaisIds;
    }

    public void setMateriaisIds(List<Long> materiaisIds) {
        this.materiaisIds = materiaisIds;
    }

    public List<Long> getFormasPagamentoIds() {
        return formasPagamentoIds;
    }

    public void setFormasPagamentoIds(List<Long> formasPagamentoIds) {
        this.formasPagamentoIds = formasPagamentoIds;
    }

    public List<Long> getPronosticosIds() {
        return pronosticosIds;
    }

    public void setPronosticosIds(List<Long> pronosticosIds) {
        this.pronosticosIds = pronosticosIds;
    }
}
