
package edu.elon.events;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rfeather
 */
@WebServlet(name = "HalloweenServlet", urlPatterns = {"/goelon"})
public class HalloweenServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
doPost(request,response);
        }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
           
  String url = "/subscribe.html";
    
  // get current action
  String action = request.getParameter("action");
  if (action == null) {
    action = "join";  // default action
  }

  // perform action and set URL to appropriate page
  if (action.equals("join")) {
    url = "/index.html";    // the "join" page
  } 
  else if (action.equals("add")) {
    // get parameters from the request
    String firstName = request.getParameter("firstname");
    String lastName = request.getParameter("lastname");
    String email = request.getParameter("email");
    String zipcode = request.getParameter("zipcode");
   
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(email);
    System.out.println(zipcode);
    url="/subscribe.html";
    }
    
            

     
    getServletContext()
            .getRequestDispatcher(url)
                    .forward(request, response);
}
    

}
