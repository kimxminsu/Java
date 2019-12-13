import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Guestbook extends HttpServlet {
	private String filePath;
//	밑에 wireToFile 에서 filePath 써야되니까 로컬변수 말고 필드 변수로 !

	@Override
	public void init() throws ServletException {
		filePath = getServletContext().getRealPath("/") + "Guestbook.txt"; // "../JPcourse/Guestbook.txt"
//		C/Program 이엇는데 D로 옮겨지면 JPcourse 앞에 경로가 바뀔 수도 있음 
//		프로그램 안에 절대경로를 적는건 바람직하지 않아서 가져오는 경로=filePath, init + ctrl space
//		루트 경로를 가져옴 (C/programfile/Tomcat/webapps 까지)

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("NAME");
		String affl = req.getParameter("AFFL");
		String email = req.getParameter("EMAIL");
		synchronized (this) { //동시접속 처리 - 운영체제에서 cs에서 베타적?으로 실행할라고 내가 하면 상대방이 못쓰게?? synchronized + ctrl space
			writeToFile(name + "\t" + affl + "\t" + email);
		}
		PrintWriter out = resp.getWriter();
		out.println("Your information was saved");
		//위에 두줄은 결과값 프린트 하는거 ! 이거 안하면 실행해도 흰화면만 뜬다
	}

	private void writeToFile(String line) {
		try {
			FileWriter oF = new FileWriter(new File(filePath), true); // append mode open
//			익셉션->try catch
			oF.write(line + "\n");
			oF.close();
		} catch (Exception e) {
		}
	}
}
