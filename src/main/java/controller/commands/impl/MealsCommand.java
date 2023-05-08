package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MealsCommand implements Command {

    //public MealService mealService = new MealService();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        /*
        HttpSession session = request.getSession(false);
        if(session.getAttribute("name") == null)
            return Pages.LOG_IN_REDIRECT;

        if (request.getMethod().equals("POST")) {
           return Pages.CUSTOMER_ORDERS_PAGE_REDIRECT;
        }
        System.out.println(session.getId());
        */

/*
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(;

            Gson g = new Gson();
            Student s = g.fromJson(jsonString, Student.class)*/
/*        if(request.getMethod().equals("POST")) {
            Long mealId = -1L, customerId;
            try {
                Gson gson = new Gson();
                JsonObject body = gson.fromJson(request.getReader(), JsonObject.class);
                if (body.has("meal_id")) {
                    mealId = body.get("meal_id").getAsLong();
                }
                customerId = Long.parseLong(request.getSession().getAttribute("id").toString());

                DaoFactory.getInstance().createOrderDao().create(
                        mealId,
                        customerId
                );
            }
            catch (Exception e) {
                System.out.println("exception");
                System.out.println(e.getMessage());
            }
        }

        request.setAttribute("list", mealService.getAll());
        return Pages.CUSTOMER_MEALS_PAGE;*/
        return null;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {

    }
}
