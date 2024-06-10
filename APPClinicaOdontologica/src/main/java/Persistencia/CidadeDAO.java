package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entidades.Cidade;
import Entidades.UF;

public class CidadeDAO {
    private Connection connection;

    public CidadeDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvarCidade(Cidade cidade) throws SQLException {
        String sql = "INSERT INTO cidades (nome, uf_id) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cidade.getNome());
            statement.setLong(2, cidade.getUf().getId());

            statement.executeUpdate();
        }
    }

    public List<Cidade> listarCidades() throws SQLException {
        List<Cidade> cidades = new ArrayList<>();
        String sql = "SELECT id, nome, uf_id FROM cidades";

        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(resultSet.getLong("id"));
                cidade.setNome(resultSet.getString("nome"));

                UF uf = new UF();
                uf.setId(resultSet.getLong("uf_id"));
                cidade.setUf(uf);

                cidades.add(cidade);
            }
        }

        return cidades;
    }
}
