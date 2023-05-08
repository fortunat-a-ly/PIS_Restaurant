package controller.commands.impl;

import controller.commands.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationCommand implements Command {

    ///private final AccountService accountService = new AccountService();
   // private final AccountMapper accountMapper= new AccountMapper();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
/*
        if (request.getMethod().equals("GET")) {
            return Pages.REGISTRATION_FORM_PAGE;
        } else {
            Account account = accountMapper.extractFromHttpRequest(request);

            try {
                accountService.registerAccount(account, account.getPassword());
            } catch (Exception e) {
                System.out.println("exception");
                throw new RuntimeException(e);
            }
            clearRequestAttributes(request);
            return Pages.LOG_IN_REDIRECT;
        }
*/


        return null;
    }

    @Override
    public void clearRequestAttributes(HttpServletRequest request) {
/*        request.getSession().removeAttribute(AppConstants.RequestAttributes.ACCOUNT_CONFIRM_PASSWORD_ATTRIBUTE);
        request.getSession().removeAttribute(AppConstants.RequestAttributes.ACCOUNT_EMAIL_ATTRIBUTE);
        request.getSession().removeAttribute(AppConstants.RequestAttributes.ACCOUNT_NAME_ATTRIBUTE);
        request.getSession().removeAttribute(AppConstants.RequestAttributes.APP_PASSWORD_ATTRIBUTE);
        request.getSession().removeAttribute(AppConstants.RequestAttributes.APP_NAME_ATTRIBUTE);
    */}
}
