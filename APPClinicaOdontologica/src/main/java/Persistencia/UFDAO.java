package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.UF;

public class UFDAO {
    private Connection connection;

    public UFDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarUF(UF uf) throws SQLException {
        String sql = "INSERT INTO ufs (descricao) VALUES (?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, uf.getDescricao());

            statement.executeUpdate();
        }
    }
}
