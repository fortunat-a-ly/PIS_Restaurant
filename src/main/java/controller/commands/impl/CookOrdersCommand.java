package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookOrdersCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Pages.COOK_ORDERS_PAGE;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {

    }
}
