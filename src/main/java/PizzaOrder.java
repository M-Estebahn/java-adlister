import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrder", value = "/pizza-order")
public class PizzaOrder extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("/pizza-order.jsp");
        view.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String size=request.getParameter("size");
        String sauce=request.getParameter("sauce");
        String crust=request.getParameter("crust");
        String address=request.getParameter("address");
        String [] toppings=request.getParameterValues("toppings");



        System.out.println(size);
        System.out.println(sauce);
        System.out.println(crust);
        System.out.println(address);
        System.out.println(Arrays.toString(toppings));
        response.sendRedirect("pizza-order");

    }
}
