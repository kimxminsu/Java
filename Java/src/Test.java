import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC"); // JDBC 대문자로 입력
			Connection DB = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MINSU\\Desktop\\Java\\CounselHelper-DB\\DB_memo.db");
			Statement sql = DB.createStatement();
			String address=quote("서울");
			int rowsAffected = sql.executeUpdate("insert into TB_memo values ('2019-11-29','홍길동',"+address+",'남자','한국인','학업 상담')");
			System.out.println(rowsAffected + " rows inserted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static String quote(String v) {
		return "'"+v+"'";
	}
}