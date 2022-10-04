package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();  // Reaproveitamento da classe "FabricaConexao".
		// Comando para criação da tabela "pessoas" dentro do BD "curso_java" no mySQL.
		String sql = "create table if not exists pessoas (" + "codigo int auto_increment primary key," + "nome varchar(80) not null" + ")";
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		System.out.println("Tabela criada com sucesso!");
		conexao.close();
	}
}