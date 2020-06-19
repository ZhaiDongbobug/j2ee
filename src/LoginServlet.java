import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	//实例化
	public LoginServlet() {
		System.out.println("LoginServlet 构造方法 被调用");
	}
	//初始化
	public void init(ServletConfig config) {
		System.out.println("init(ServletConfig)");
	}
	
	//提供服务
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取中文的参数，如果不写这行代码，服务器显示乱码
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		//System.out.println(name);
		
		String html = null;
		
		if("admin".equals(name)&&"123".equals(password)) {
			request.getRequestDispatcher("success.html").forward(request, response);
		}else {
			response.sendRedirect("fail.html");
		}
		//返回中文的响应
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = response.getWriter();
		pw.println(html);
	}
	//销毁
	public void destory() {
		System.out.println("destory()");
	}
	
}
