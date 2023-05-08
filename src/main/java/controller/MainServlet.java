package controller;

import controller.commands.Command;
import controller.commands.impl.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class MainServlet extends HttpServlet {
    private final Map<String, Command> commands = new HashMap<>();

    public void init() {
        commands.put("registration", new RegistrationCommand());
        commands.put("login", new LogInCommand());
        commands.put("logout", new LogOutCommand());
        commands.put("meals", new MealsCommand());
        commands.put("add-to-cart", new OrderCommand());
        commands.put ("cook/orders", new CookOrdersCommand());
        commands.put ("user/orders", new CustomerOrdersCommand());
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      // request.getRequestDispatcher("/restaurant/test.jsp").forward(request, response);


    }
}

