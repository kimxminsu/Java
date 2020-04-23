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
//	�ؿ� wireToFile ���� filePath ��ߵǴϱ� ���ú��� ���� �ʵ� ������ !

	@Override
	public void init() throws ServletException {
		filePath = getServletContext().getRealPath("/") + "Guestbook.txt"; // "../JPcourse/Guestbook.txt"
//		C/Program �̾��µ� D�� �Ű����� JPcourse �տ� ��ΰ� �ٲ� ���� ���� 
//		���α׷� �ȿ� �����θ� ���°� �ٶ������� �ʾƼ� �������� ���=filePath, init + ctrl space
//		��Ʈ ��θ� ������ (C/programfile/Tomcat/webapps ����)

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("NAME");
		String affl = req.getParameter("AFFL");
		String email = req.getParameter("EMAIL");
		synchronized (this) { //�������� ó�� - �ü������ cs���� ��Ÿ��?���� �����Ҷ�� ���� �ϸ� ������ ������?? synchronized + ctrl space
			writeToFile(name + "\t" + affl + "\t" + email);
		}
		PrintWriter out = resp.getWriter();
		out.println("Your information was saved");
		//���� ������ ����� ����Ʈ �ϴ°� ! �̰� ���ϸ� �����ص� ��ȭ�鸸 ���
	}

	private void writeToFile(String line) {
		try {
			FileWriter oF = new FileWriter(new File(filePath), true); // append mode open
//			�ͼ���->try catch
			oF.write(line + "\n");
			oF.close();
		} catch (Exception e) {
		}
	}
}
