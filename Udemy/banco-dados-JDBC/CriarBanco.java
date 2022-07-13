package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "val25790";
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		Statement stmt = conexao.createStatement();
		stmt.execute("create database if not exists curso_java");  // Comando para criação do BD.
		System.out.println("BD curso_java criado com sucesso!");
		// stmt.execute("drop database if exists curso_java");  // Comando para exclusão do BD.
		// System.out.println("BD excluído com sucesso!");
		conexao.close();
	}
}