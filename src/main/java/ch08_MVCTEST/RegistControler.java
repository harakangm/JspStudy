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
@WebServlet("/rcon")
public class RegistControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
    //DB를 담을 객체
	RegistDb db;
	RegistDb db2;
			
	
    @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//이닛은 처음 서블렛이 시작되고 초기화 된후에 한번만 실행
		db = new RegistDb();
		db2 = new RegistDb();
	}
        
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("어디지?1");
		//페이지를 컨트롤 할수 있게 해주는 변수
		String action = request.getParameter("action");
		//뷰단 이동 할때 사용 할 변수
		String view = "";
		
		if(action == null) {
			getServletContext().getRequestDispatcher("/rcon?action=list").forward(request, response);
		}else {
			switch (action) {
			case "list":
					view = showList(request,response);
				break;

			case "info":
					view = showInfo(request,response);
				break;
			case "list2":
					view = showList3(request,response);
				break;
			}
		}
		
		getServletContext().getRequestDispatcher("/ch08_MVCTEST/" + view).forward(request, response);
		System.out.println("어디지?2");
	}

	
	String showList(HttpServletRequest request, HttpServletResponse response) {
		List<Regist> reg = db.showAllInfo();
		 //setAttribute 키값으로 값을 저장해주는데 리퀘스트 리스폰스 할때 까지 값이 살아있어서 뿌려주는게 가능
//		for(Regist r : reg) {
//			if(r.getGrade().contains("일반")) {
//				r.setGrade("silver");
//			}else if (r.getGrade().contains("중간")) {
//				r.setGrade("gold");
//			}else if(r.getGrade().contains("최상")) {
//				r.setGrade("vip");
//			}
//		}
		 request.setAttribute("reg", reg);
		return "viewFirst.jsp";
	}

	
	String showInfo(HttpServletRequest request, HttpServletResponse response) {
		Regist p = db.find(request.getParameter("id"));
		System.out.println(p);
		request.setAttribute("p", p);
		return "viewResult.jsp";
	}
	
	String showList2 (HttpServletRequest request, HttpServletResponse response) {
		List<Regist> reg = db.showAllInfo();
		for(Regist r : reg) {
			if(r.getGrade().equals("silver")) {
				r.setGrade("silver(일반)");
			}else if (r.getGrade().equals("gold")) {
				r.setGrade("gold(중간)");
			}else if (r.getGrade().equals("vip")) {
				r.setGrade("vip(최상)");
			}
		}
		
		request.setAttribute("reg", reg);		 		 		
		return "viewFirst.jsp";
	}
	
	String showList3 (HttpServletRequest request, HttpServletResponse response) {
		List<Regist> reg = db2.showAllInfo();
		request.setAttribute("reg", reg);
		return "viewFirst.jsp";
	}
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistControler() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
