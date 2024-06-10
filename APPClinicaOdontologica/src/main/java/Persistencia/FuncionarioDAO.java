package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Funcionario;

public class FuncionarioDAO {
    private Connection connection;

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionarios (nome, cpf, rg, data_nascimento, telefone, email, sexo, funcao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getCpf());
            statement.setString(3, funcionario.getRg());
            statement.setDate(4, new java.sql.Date(funcionario.getDataNascimento().getTime()));
            statement.setString(5, funcionario.getTelefone());
            statement.setString(6, funcionario.getEmail());
            statement.setString(7, funcionario.getSexo());
            statement.setLong(8, funcionario.getFuncao().getId());

            statement.executeUpdate();
        }
    }
}
