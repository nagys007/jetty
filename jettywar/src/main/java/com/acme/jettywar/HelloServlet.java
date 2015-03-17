/*
 * http://wiki.eclipse.org/Jetty/Tutorial/Jetty_and_Maven_HelloWorld
 * 
 * cmd.exe:
 * ------------
 * D:
 * cd D:\java\workspace\jettywar
 * mvn jetty:run
 * 
 * Firefox:
 * ------------
 * http://localhost:8080/hello
 * 
 * */

package com.acme.jettywar;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

/**
 * Hello world!
 *
 */
public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Hello Servlet</h1>");
        response.getWriter().println("session=" + request.getSession(true).getId());
    }
}