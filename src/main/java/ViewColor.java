import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ViewColor", value = "/viewcolor")
public class ViewColor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        request.setAttribute("color", color);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);

    }


}
