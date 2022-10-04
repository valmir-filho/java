package jdbc;

public class DaoTeste {
	public static void main(String[] args) {
		Dao dao = new Dao();
		String sql = "insert into pessoas (nome) values (?)";
		System.out.println(dao.incluir(sql, "Marcia de Miranda Conque"));
		System.out.println(dao.incluir(sql, "Silvia Moro Conque Spinelli"));
		System.out.println(dao.incluir(sql, "Ângelo Spinelli"));
		dao.close();
	}
}