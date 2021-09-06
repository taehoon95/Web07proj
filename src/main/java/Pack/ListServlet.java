package Pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list.do")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListServlet() {
    	System.out.println("리스트 생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("두갯");
		Map<Integer,String> empMap = new HashMap<>();
		empMap.put(1,"이순신");
		empMap.put(2,"유관순");
		empMap.put(3,"강감찬");
		
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		out.println(
				"<html>"+
						"<body>"+
							"<h1>회원 목록 페이지</h1>"+
							"<table>"+
								"<tr>"+
									"<td>이름</td>"+
									"<td>삭제</td>"+
									"<td>수정</td>"+
								"</tr>");
		for(int i = 1; i < empMap.size()+1; i++) {
			out.println("<tr>");
				out.println("<td name = 'name'>");
					out.println(empMap.get(i));
				out.println("</td>");
				out.println("<td><a href = 'delete.do?name?"+ empMap.get(i) +"'>삭제</a></td>");
				out.println("<td><a href = 'update.do?name?"+ empMap.get(i) +"'>수정</a></td>");
			out.println("</tr>");
		}
		out.println(
							"</table>"+
						"</body>"+
				"</html>"
		);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
