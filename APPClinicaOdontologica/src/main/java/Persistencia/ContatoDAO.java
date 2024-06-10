package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Contato;

public class ContatoDAO {
    private Connection connection;

    public ContatoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarContato(Contato contato) throws SQLException {
        String sql = "INSERT INTO contatos (nome, telefone, email, tipo_contato_id, paciente_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getTelefone());
            statement.setString(3, contato.getEmail());
            statement.setLong(4, contato.getTipoContato().getId());
            statement.setLong(5, contato.getPaciente().getId());

            statement.executeUpdate();
        }
    }
}
