package ua.epam.servlet.filter;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LoggingFilter implements Filter {
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		 
        HttpServletRequest request = (HttpServletRequest) req;
         
        //Get the IP address of client machine.
        String ipAddress = request.getRemoteAddr() ; 
        String localAddr =  request.getLocalAddr();
        String userName = request.getLocalName();
        String URL = request.getRequestURI();
        
         
        //Log the IP address and current timestamp + username.
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> IP=<"+ipAddress + "> URL=<" + URL+ ">, user=<" + userName + ">, on time " + new Date().toString());
        chain.doFilter(req, res);
    }
    public void init(FilterConfig config) throws ServletException {
         
        //Get init parameter
        String testParam = config.getInitParameter("test-param");
         
        //Print the init parameter
        System.out.println("Test Param: " + testParam);
    }
    public void destroy() {
        //add code to release any resource
    }

}