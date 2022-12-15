package ch08_MVC;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/pcontrol")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService service;

	//최초의 서블릿이 생성될때 한번만 호출됨 : 서비스 객체를 하나만 생성해서 공유하기 위해
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		service = new ProductService(); // 서블릿이 초기화 될때 ProductService객체를 생성
	}

	// 클라이언트에서 reqest가 오면 service가 실행된다.
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		String view = "";
		
		if (action == null) {
			System.out.println(getServletContext());
			getServletContext().getRequestDispatcher("/pcontrol?action=list").forward(request, response);
		} else {
			switch (action) {
			case "list":
				view = list(request, response);
				break;
			case "info":
				view = info(request, response);
				break;
			}
		}

		getServletContext().getRequestDispatcher("/ch08_MVC02/" + view).forward(request, response);
	}
	

	private String info(HttpServletRequest request, HttpServletResponse response) {
		//상품 한가지를 가져옴
		Product p = service.find(request.getParameter("id"));
		//리퀘스트 리스폰스 하는 과정에서 값을 가져다 쓸 수 있음
		request.setAttribute("p", p);
		return "productInfo.jsp";
	}
	
	private String list(HttpServletRequest request, HttpServletResponse response) {
		//상품에 대한 정보를가져온다.
		//가져온 리스트를 일단 저장해둠
		List<Product> plist = service.findAll();
		request.setAttribute("products", plist);
		return "productList.jsp";
	}

}
