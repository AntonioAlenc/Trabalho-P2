package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.FormaPagamento;

public class FormaPagamentoDAO {
    private Connection connection;

    public FormaPagamentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarFormaPagamento(FormaPagamento formaPagamento) throws SQLException {
        String sql = "INSERT INTO formas_pagamento (valor, tipo_pagamento_id, consulta_id) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDouble(1, formaPagamento.getValor());
            statement.setLong(2, formaPagamento.getTipoPagamento().getId());
            statement.setLong(3, formaPagamento.getConsulta().getId());

            statement.executeUpdate();
        }
    }
}
