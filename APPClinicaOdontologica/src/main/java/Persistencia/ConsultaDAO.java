package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Consulta;

public class ConsultaDAO {
    private Connection connection;

    public ConsultaDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarConsulta(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consultas (data_hora, diagnostico, receituario, exames, paciente_id, funcionario_id) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setTimestamp(1, new java.sql.Timestamp(consulta.getDataHora().getTime()));
            statement.setString(2, consulta.getDiagnostico());
            statement.setString(3, consulta.getReceituario());
            statement.setString(4, consulta.getExames());
            statement.setLong(5, consulta.getPaciente().getId());
            statement.setLong(6, consulta.getFuncionario().getId());

            statement.executeUpdate();
        }
    }
}
