package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HellowWorld
 */
//현재 클래스가 서블릿 클래스 라는걸 알리기 위해 사용
@WebServlet("/HelloWorld") //urlPatterns: 어떤 요청에 의해 서블릿을 호출할 것인지 결정(url mapping)
public class HellowWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HellowWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //get방식의 요청을 처리한다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request  클라이언트단이 서버단에 요청
		//response 클라이언트단에 응답
		//setContentType() 콘탠츠의 타입을 지정해주는 메서드
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
		.append("<h2>Hello World !!??????</h2><hr>")
		.append("현재 날짜와 시간은: "+java.time.LocalDateTime.now())
		.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//post방식으 요청을 처리한다
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
