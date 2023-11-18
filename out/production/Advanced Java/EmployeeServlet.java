import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
javax.servlet.http.HttpSession;
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet
{ private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { String action = request.getParameter("action");
        if (action == null) { request.getRequestDispatcher("employee-form.jsp").forward(request, response); }
             else if (action.equals("add")) {  String employeeID = request.getParameter("employeeID");
             String employeeName = request.getParameter("employeeName"); String dateOfBirth = request.getParameter("dateOfBirth");
             String email = request.getParameter("email"); String joiningDate = request.getParameter("joiningDate");
            Add employee data to the session HttpSession session = request.getSession();
             List<Employee> employees = (List<Employee>) session.getAttribute("employees");
             if (employees == null) { employees = new ArrayList<>();
             } Employee employee = new Employee(employeeID, employeeName, dateOfBirth, email, joiningDate);
             employees.add(employee); session.setAttribute("employees", employees);
             response.sendRedirect("EmployeeServlet"); } else if (action.equals("details")) {   HttpSession session = request.getSession();
                List<Employee> employees = (List<Employee>) session.getAttribute("employees");
                if (employees == null) {
                    employees = new ArrayList<>();
                }
                request.setAttribute("employees", employees);
                request.getRequestDispatcher("employee-details.jsp").forward(request, response);
            }
             }
             }