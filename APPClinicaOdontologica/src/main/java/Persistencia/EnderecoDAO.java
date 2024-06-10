package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Endereco;

public class EnderecoDAO {
    private final Connection connection;

    public EnderecoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarEndereco(Endereco endereco) throws SQLException {
        String sql = "INSERT INTO enderecos (rua, numero, bairro, complemento, cep, cidade_id, paciente_id) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, endereco.getRua());
            statement.setString(2, endereco.getNumero());
            statement.setString(3, endereco.getBairro());
            statement.setString(4, endereco.getComplemento());
            statement.setString(5, endereco.getCep());
            statement.setLong(6, endereco.getCidade().getId());
            statement.setLong(7, endereco.getPaciente().getId());

            statement.executeUpdate();
        }
    }
}
