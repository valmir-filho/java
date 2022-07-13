package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = scan.nextLine();
		Connection conexao = FabricaConexao.getConexao();
		// Comando para inserção de dados (nesse caso "nome") na tabela "pessoas".
		String sql = "insert into pessoas (nome) values (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);  // Método para assegurar a inserção correta dos dados (evitar o "SQL Injection"). 
		stmt.setString(1, nome);
		stmt.execute();
		System.out.println("Pessoa incluída com sucesso!");
		scan.close();
	}
}