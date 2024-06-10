package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Paciente;

public class PacienteDAO {
    private Connection connection;

    public PacienteDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarPaciente(Paciente paciente) throws SQLException {
        String sql = "INSERT INTO pacientes (nome, cpf, data_nascimento, sexo, telefone, email, senha, observacoes) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, paciente.getNome());
            statement.setString(2, paciente.getCpf());
            statement.setDate(3, new java.sql.Date(paciente.getDataNascimento().getTime()));
            statement.setString(4, paciente.getSexo());
            statement.setString(5, paciente.getTelefone());
            statement.setString(6, paciente.getEmail());
            statement.setString(7, paciente.getSenha());
            statement.setString(8, paciente.getObservacoes());

            statement.executeUpdate();
        }
    }
}
