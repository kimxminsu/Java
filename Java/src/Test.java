import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC"); // JDBC �빮�ڷ� �Է�
			Connection DB = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MINSU\\Desktop\\Java\\CounselHelper-DB\\DB_memo.db");
			Statement sql = DB.createStatement();
			String address=quote("����");
			int rowsAffected = sql.executeUpdate("insert into TB_memo values ('2019-11-29','ȫ�浿',"+address+",'����','�ѱ���','�о� ���')");
			System.out.println(rowsAffected + " rows inserted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static String quote(String v) {
		return "'"+v+"'";
	}
}