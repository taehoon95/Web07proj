package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert.do")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public InsertServlet() {
		System.out.println("�μ�Ʈ ������ ��");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�ΰ�");
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println(
				"<html>"+
						"<body>"+
							"<h1>"+name+" ���ԿϷ�Ǿ����ϴ�.</h1>"+
						"</body>"+
				"</html>"
		);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
