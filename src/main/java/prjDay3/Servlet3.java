package prjDay3;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/foodInfoAll")
public class Servlet3 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Food> list = new ArrayList<>();
		
		list.add(new Food("빼빼로",1500));
		list.add(new Food("초코송이",800));
		list.add(new Food("솜사탕",2000));
		
		// model 심기
		request.setAttribute("foodList", list);
		
		// 지정된 view forword
		request.getRequestDispatcher("/foodView.jsp").forward(request, response)
		
	}
}
