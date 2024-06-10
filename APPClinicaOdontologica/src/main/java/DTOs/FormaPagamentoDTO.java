package DTOs;

public class FormaPagamentoDTO {
    private Long id;
    private Double valor;
    private Long tipoPagamentoId;
    private String tipoPagamentoDescricao;
    private Long consultaId;

    // Construtor sem parâmetros
    public FormaPagamentoDTO() {
    }

    // Construtor com parâmetros
    public FormaPagamentoDTO(Long id, Double valor, Long tipoPagamentoId, String tipoPagamentoDescricao, Long consultaId) {
        this.id = id;
        this.valor = valor;
        this.tipoPagamentoId = tipoPagamentoId;
        this.tipoPagamentoDescricao = tipoPagamentoDescricao;
        this.consultaId = consultaId;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getTipoPagamentoId() {
        return tipoPagamentoId;
    }

    public void setTipoPagamentoId(Long tipoPagamentoId) {
        this.tipoPagamentoId = tipoPagamentoId;
    }

    public String getTipoPagamentoDescricao() {
        return tipoPagamentoDescricao;
    }

    public void setTipoPagamentoDescricao(String tipoPagamentoDescricao) {
        this.tipoPagamentoDescricao = tipoPagamentoDescricao;
    }

    public Long getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Long consultaId) {
        this.consultaId = consultaId;
    }
}
