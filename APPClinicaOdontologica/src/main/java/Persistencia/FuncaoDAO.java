package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Funcao;

public class FuncaoDAO {
    private Connection connection;

    public FuncaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarFuncao(Funcao funcao) throws SQLException {
        String sql = "INSERT INTO funcoes (nome) VALUES (?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, funcao.getNome());

            statement.executeUpdate();
        }
    }
}
