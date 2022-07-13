package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o código: ");
		int codigo = scan.nextInt();
		Connection conexao = FabricaConexao.getConexao();
		String sql = "delete from pessoas where codigo = ?";  // Comando para exclusão dos dados da tabela "pessoas".
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluída com sucesso!");
		} else {
			System.out.println("Erro! Código inexistente.");
		}
		scan.close();
		conexao.close();
	}
}