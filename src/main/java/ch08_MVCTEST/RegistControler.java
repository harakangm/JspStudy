package ch08_MVCTEST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistControler
 */
@WebServlet("/recon")
public class RegistControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //DB를 담을 객체
	RegistDb db;
	
	
	
	
    @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//이닛은 처음 서블렛이 시작되고 초기화 된후에 한번만 실행
		db = new RegistDb();
	}
        
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//페이지를 컨트롤 할수 있게 해주는 변수
		String action = request.getParameter("action");
		//뷰단 이동 할때 사용 할 변수
		String view = "";
		
		if(action == null) {
			getServletContext().getRequestDispatcher("/recon?action=list").forward(request, response);
		}else {
			switch (action) {
			case "list":
					view = showList(request,response);
				break;

			case "info":
					view = showInfo(request,response);
				break;	
			}
		}
		getServletContext().getRequestDispatcher("/ch08_MVCTEST" + view).forward(request, response);
	}

	
	String showList(HttpServletRequest request, HttpServletResponse response) {
			List<Regist> reg = db.showAllInfo();
		
		 //setAttribute 키값으로 값을 저장해주는데 리퀘스트 리스폰스 할때 까지 값이 살아있어서 뿌려주는게 가능
		 request.setAttribute("attri", reg);
		return "/viewFirst.jsp";
	}

	
	String showInfo(HttpServletRequest request, HttpServletResponse response) {
		
		return "/viewResult.jsp";
	}
	
}
