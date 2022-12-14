package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checklogin
 */
@WebServlet("/check")
public class Checklogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checklogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	 String id = request.getParameter("ID");
//	 String password = request.getParameter("password");
//	 
//	 String str;
//	 if(id.equals("person") && password.equals("1234")){
//		 str ="person님 반갑습니다";
//	 }else {
//		 str = "로그인 실패";
//	 }
	 
	 
	 response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
		.append("<h1>로그인 결과</h1>")
		.append(result(request))
		.append("</body></html>");
	 
	}
	
	static String result(HttpServletRequest request) {
		String id = request.getParameter("ID");
		String password = request.getParameter("password");
		 String str;
		 if(id.equals("person") && password.equals("1234")){
			 str ="person님 반갑습니다";
		 }else {
			 str = "로그인 실패";
		 }
		 return str;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
