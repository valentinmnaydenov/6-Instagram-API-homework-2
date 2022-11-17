package Client;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "posts", value = "/posts")
public class Posts extends HttpServlet {

    private static ArrayList<PostsInfo> posts;

    private static int counter = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        boolean hasPosts = false;
        int user_id = Integer.parseInt(request.getParameter("accountId"));
        for(int i = 0; i < posts.size(); i++){
            if(posts.get(i).getUser_id() == user_id){
                hasPosts = true;
            }
        }
        if(!hasPosts){
            try {
                response.sendError(400, "Tozi user nqma posts");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        if(Login.getLoggedUserId() == 0){
            try {
                resp.sendError(402, "Nqma lognat user");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}