package api;

import Utils.WeChatService;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/loginDemo")
public class LoginDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String wechatCode = request.getParameter("code");
        String Appid = "wxbb8dcd951112491a";
        String AppidSecret = "3ac5c99decc3c93fc17bfec75f69ba56";
        String openId = WeChatService.GetOpenID(Appid, AppidSecret, wechatCode);
        response.getWriter().write(new ObjectMapper().writeValueAsString(openId));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
