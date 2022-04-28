import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Incorrect", value = "/incorrect")
public class Incorrect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", false);
        request.getRequestDispatcher("/answer.jsp").forward(request, response);


    }

}
