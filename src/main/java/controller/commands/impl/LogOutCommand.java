package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session=request.getSession(false);
        if(session != null) {
            System.out.println(session.getId());
            session.removeAttribute("name");
        }

        return Pages.LOG_IN_REDIRECT;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {

    }
}
