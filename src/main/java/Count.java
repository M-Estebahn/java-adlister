import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Count")
public class Count extends HttpServlet {

    int pageCount = 0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        pageCount+=1;
            response.getWriter().println("You have viewed this page "+pageCount+" times.");
        if(request.getParameter("reset")!=null) {
            pageCount = 0;
            response.sendRedirect("/Count");
        }
    }



}
