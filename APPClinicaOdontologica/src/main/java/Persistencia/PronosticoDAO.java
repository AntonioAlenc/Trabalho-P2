package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Pronostico;

public class PronosticoDAO {
    private Connection connection;

    public PronosticoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarPronostico(Pronostico pronostico) throws SQLException {
        String sql = "INSERT INTO pronosticos (descricao, consulta_id) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, pronostico.getDescricao());
            statement.setLong(2, pronostico.getConsulta().getId());

            statement.executeUpdate();
        }
    }
}
