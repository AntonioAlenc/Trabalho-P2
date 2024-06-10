package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.TipoContato;

public class TipoContatoDAO {
    private Connection connection;

    public TipoContatoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarTipoContato(TipoContato tipoContato) throws SQLException {
        String sql = "INSERT INTO tipos_contato (nome) VALUES (?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoContato.getNome());

            statement.executeUpdate();
        }
    }
}
