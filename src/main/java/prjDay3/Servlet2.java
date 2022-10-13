package prjDay3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s21013")
public class Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		// id에 대한 회원정보를 DB로 가져온다 (작업)
		// 임의로
		String name="홍길동";
		String addr="서울";
		
		//Model
		User user = new User(id,name,addr);
		
		RequestDispatcher r =request.getRequestDispatcher("/result.jsp");
		request.setAttribute("userInfo", user);
		
		r.forward(request, response);
	}
}
