<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.exavalu.entities.Employee"%>
<%if (request.getSession().getAttribute("User") == null)
        request.getRequestDispatcher("login.jsp").forward(request, response);
%>
<!doctype html>
<html lang="en">
    
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.108.0">
        <title>Product example · Bootstrap v5.3</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/product/">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">





        <link href="css/bootstrap.min.css" rel="stylesheet" >

        <!-- Favicons -->
        <link rel="apple-touch-icon" href="/docs/5.3/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
        <link rel="icon" href="/docs/5.3/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
        <link rel="icon" href="/docs/5.3/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
        <link rel="manifest" href="/docs/5.3/assets/img/favicons/manifest.json">
        <link rel="mask-icon" href="/docs/5.3/assets/img/favicons/safari-pinned-tab.svg" color="#712cf9">
        <link rel="icon" href="/docs/5.3/assets/img/favicons/favicon.ico">
        <meta name="theme-color" content="#712cf9">


        <link href="css/menu_css.css" rel="stylesheet">
        <style>
            table, td, th{
                border:#000;
                border-width:medium;
                border: 1px solid;
            }
            </style>

        <!-- Custom styles for this template -->
        <link href="css/product.css" rel="stylesheet">
    </head>
    <body>

        <jsp:include page="menu.jsp"></jsp:include>

        <%
            ArrayList empList = (ArrayList) request.getAttribute("EmpList");
            Iterator itr = empList.iterator();
        %>
        <table>
            <th>
            <td>
                Employee Id
            </td>
            <td>
                First Name
            </td>
            <td>
                Last Name
            </td>
            <td>
                Address
            </td>
            <td>
                Phone
            </td>
            <td>
                Gender
            </td>
            <td>
                Age
            </td>
            <td>
                Department
            </td>
            <td>
                Role
            </td>
            <td>
                Basic Salary
            </td>
            <td>
                Car Allowance
            </td>

        </th>
        
        <%
            while (itr.hasNext()) {
                Employee emp = (Employee) itr.next();
        %>
        <tr>
            <td>
                <%=emp.getEmployeeId()%>
            </td>
            <td>
                <%=emp.getFirstName()%>
            </td>
            <td>
                <%=emp.getLastName()%>
            </td>
            <td>
                <%=emp.getAddress()%>
            </td>
            <td>
                <%=emp.getPhone()%>
            </td>
            <td>
                <%=emp.getGender()%>
            </td>
            <td>
                <%=emp.getAge()%>
            </td>
            <td>
                <%=emp.getDepartmentName()%>
            </td>
            <td>
                <%=emp.getRoleName()%>
            </td>
            <td>
                <%=emp.getBasicSalary()%>
            </td>
            <td>
                <%=emp.getCarAllaowance()%>
            </td>
        </tr>

        <%
            }
        %>



    </table>






    <script src="/docs/5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>


</body>
</html>
