package  Client;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {
    private String username;
    private int password;

    private static UserInfo logged_user;

    private boolean exists = false;
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        username = req.getParameter("username");
        password = Integer.parseInt(req.getParameter("password"));



        ArrayList<UserInfo> userCheck = Register.getUsers();


        for(int j = 0; j < userCheck.size(); j++){
            if(userCheck.get(j).getUsername().equals(username) && userCheck.get(j).getPassword() == password){
                exists = true;
                logged_user = userCheck.get(j);
                break;
            }
        }



        }

    public static int getLoggedUserId(){
        return logged_user.getId();
    }
}