package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Pages.DEFAULT_PAGE;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {

    }
}
