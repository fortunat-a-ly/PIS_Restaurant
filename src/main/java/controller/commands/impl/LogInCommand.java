package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogInCommand implements Command {

    //private final AccountService accountService = new AccountService();
    @Override
    public String execute(HttpServletRequest request,
                          HttpServletResponse response) {
        HttpSession session = request.getSession(false);

        // check if already logged in
        if(session.getAttribute("name") != null) {
            System.out.println(session.getId());
            System.out.println("session is not null");
            return Pages.CUSTOMER_PAGE_REDIRECT;
        }

        String name=request.getParameter("name");
        String password=request.getParameter("password");

        // check if login is successful
        if(name != null && password.equals("a")) {
            System.out.println("login");
            session = request.getSession();
            System.out.println(session.getId());
            session.setAttribute("name",name);
            session.setAttribute("id", 14);
            return Pages.CUSTOMER_PAGE_REDIRECT;
        }

        return Pages.LOG_IN_FORM_PAGE;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {
       // request.getSession().removeAttribute(AppConstants.RequestAttributes.APP_NAME_ATTRIBUTE);
      //  request.getSession().removeAttribute(AppConstants.RequestAttributes.APP_PASSWORD_ATTRIBUTE);
    }
}
