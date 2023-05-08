package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerOrdersCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return Pages.CUSTOMER_ORDERS_PAGE;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {

    }
}
