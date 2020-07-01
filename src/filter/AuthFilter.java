package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
		
        String uri = request.getRequestURI();
        
        if(uri.endsWith(".js")||uri.endsWith(".css")) {
        	chain.doFilter(request, response);
        	return;
        }
                
        if (uri.endsWith("login.html")||uri.endsWith("login")) {
        	chain.doFilter(request,  response);
        	return;
        }
        
        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
        	response.sendRedirect("/jsp/login.html");
        	return;
        }
        
        chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		
		
	}

}
