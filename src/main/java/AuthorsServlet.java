import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AuthorsServlet", value = "/Authors")
public class AuthorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Authors authorsDao= new AuthorsDAO();

        List<Author> authors= authorsDao.all();
        request.setAttribute("authors",authors);

        request.getRequestDispatcher("/WEB-INF/quotes/authors.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
