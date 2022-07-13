package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarDados {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o código a ser alterado: ");
		int codigo = scan.nextInt();
		String select = "select codigo, nome from pessoas where codigo = ?";
		String update = "update pessoas set nome = ? where codigo = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual do código " + p.getCodigo() + " é: " + p.getNome() + ".");
			scan.nextLine();
			System.out.print("Digite o novo nome: ");
			String novoNome = scan.nextLine();
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			System.out.println("Nome alterado com sucesso!");
			System.out.println("O novo nome do código " + p.getCodigo() + " é: " + novoNome + ".");
		} else {
			System.out.println("Erro! Código não encontrado.");
		}
		scan.close();
		conexao.close();
	}
}