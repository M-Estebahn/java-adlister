
//3. When the user goes to "/favCity", the user sees a form where they can enter their favorite city and after submitting the form, the user should see a blank page.
//        - Define your logic in a FavoriteCity servlet
//        - User System.out.println in the doPost method of servlet to verify that the city name has been sent to the server
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favcity")
public class FavCity extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
