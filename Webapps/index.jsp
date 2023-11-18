<!DOCTYPE html>
 <html>
    <head>
         <title>Employee Information</title>
         </head> 
         <body>
             <h1>Add Employee Information</h1> 
             <form action="EmployeeServlet" method="get"> <input type="hidden" name="action" value="add">
                 Employee ID: <input type="text" name="employeeID" required><br>
                 Employee Name: <input type="text" name="employeeName" required><br>
                  Date of Birth (dd/mm/yyyy): <input type="text" name="dateOfBirth" required><br> 
                 Email: <input type="text" name="email" required><br>
                  Joining Date (dd/mm/yyyy): <input type="text" name="joiningDate" required
                 br> 
                 <input type="submit" value="Add"> </form>
                 <br>
                 <form action="EmployeeServlet" method="get"> 
                    <input type="hidden" name="action" value="details"> 
                    <input type="submit" value="Details">
                </form> 
            </body> 
            </html>
