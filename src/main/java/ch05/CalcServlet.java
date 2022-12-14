package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//HttpServletRequest request : 클라이언트에서 요청한 내용 (인스턴스)가 들어있음.
		//폼태그에 있는 name
		System.out.println(request.getParameterMap());
		int n1 = Integer.parseInt(request.getParameter("n1")); //int형으로 변경
		int n2 = Integer.parseInt(request.getParameter("n2"));
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println(request.getParameter("n1"));
		System.out.println(request.getParameter("n2"));
		//연산자를 받아옴
		String op = request.getParameter("op"); //연산자
		System.out.println("op : " + op);
		
		long result = 0; // 연산의 결과를 담을 변수
		
		switch(op) {
		case "+" : result = n1 + n2; break;
		case "-" : result = n1 - n2; break;
		case "*" : result = n1 * n2; break;
		case "/" : result = n1 / n2; break;
		}
		
		//콘탠츠 타입을 정해준다
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
		.append("계산결과" + result +"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//두겟메서드실행
		doGet(request, response);
	}

}
