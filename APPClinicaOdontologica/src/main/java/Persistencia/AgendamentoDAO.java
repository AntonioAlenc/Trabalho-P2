package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DTOs.AgendamentoDTO;

public class AgendamentoDAO {
    private final Connection connection;

    public AgendamentoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarAgendamento(AgendamentoDTO agendamentoDTO) throws SQLException {
        String sql = "INSERT INTO agendamentos (data_hora, observacao, paciente_id, paciente_nome, funcionario_id, funcionario_nome) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDate(1, new java.sql.Date(agendamentoDTO.getDataHora().getTime()));
            statement.setString(2, agendamentoDTO.getObservacao());
            statement.setLong(3, agendamentoDTO.getPacienteId());
            statement.setString(4, agendamentoDTO.getPacienteNome());
            statement.setLong(5, agendamentoDTO.getFuncionarioId());
            statement.setString(6, agendamentoDTO.getFuncionarioNome());

            statement.executeUpdate();
        }
    }
}
