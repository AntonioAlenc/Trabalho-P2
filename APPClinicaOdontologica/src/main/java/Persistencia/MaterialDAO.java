package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Entidades.Material;

public class MaterialDAO {
    private Connection connection;

    public MaterialDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarMaterial(Material material) throws SQLException {
        String sql = "INSERT INTO materiais (codigo, nome, tipo, descricao, funcionario_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, material.getCodigo());
            statement.setString(2, material.getNome());
            statement.setString(3, material.getTipo());
            statement.setString(4, material.getDescricao());
            statement.setLong(5, material.getFuncionario().getId());

            statement.executeUpdate();
        }
    }
}
