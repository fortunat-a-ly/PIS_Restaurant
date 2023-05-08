package controller.commands.impl;

public interface Pages {

    String START_PAGE_REDIRECT = "redirect:meal_booking_war/app";
    String LOG_IN_REDIRECT = "redirect:meal_booking_war/app/login";
    String REGISTRATION_FORM_PAGE = "/src/main/WEB-INF/jspPages/registration.jsp";
    String LOG_IN_FORM_PAGE = "/src/main/WEB-INF/jspPages/login.jsp";
    String DEFAULT_PAGE = "/index.jsp";

    String CUSTOMER_PAGE_REDIRECT =  "redirect:meal_booking_war/app/meals";
    String CUSTOMER_ORDERS_PAGE_REDIRECT = "redirect:meal_booking_war/app/user/orders";
    String COOK_ORDERS_PAGE_REDIRECT =  "redirect:meal_booking_war/app/cook/orders";
    String USER_ORDERS_PAGE_REDIRECT =  "redirect:meal_booking_war/app/user/orders";

    String CUSTOMER_MEALS_PAGE = "/src/main/WEB-INF/jspPages/meals.jsp";
    String COOK_ORDERS_PAGE = "/src/main/WEB-INF/jspPages/cookOrders.jsp";
    String CUSTOMER_ORDERS_PAGE = "/src/main/WEB-INF/jspPages/orders.jsp";
}
