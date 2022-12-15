package ch08_MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcControl
 */
@WebServlet("/CalcController")
public class CalcControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		int n1 = Integer.parseInt(request.getParameter("n1")); //int형으로 변경
		int n2 = Integer.parseInt(request.getParameter("n2"));

		String op = request.getParameter("op"); //연산자
		
		long result = 0; // 연산의 결과를 담을 변수
		
		switch(op) {
		case "+" : result = n1 + n2; break;
		case "-" : result = n1 - n2; break;
		case "*" : result = n1 * n2; break;
		case "/" : result = n1 / n2; break;	 
		}
							// 키값 	
		request.setAttribute("result", result);
		
		//데이터를 뷰단에 보내줌
		getServletContext().getRequestDispatcher("/ch08_MVC/calcResult.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
