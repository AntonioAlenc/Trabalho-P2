package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.TipoPagamento;

public class TipoPagamentoDAO {
    private Connection connection;

    public TipoPagamentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarTipoPagamento(TipoPagamento tipoPagamento) throws SQLException {
        String sql = "INSERT INTO tipos_pagamento (nome) VALUES (?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoPagamento.getNome());

            statement.executeUpdate();
        }
    }
}
