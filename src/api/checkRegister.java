package api;

import JdbcUtils.JDBCUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/checkRegister")
public class checkRegister extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String openid = request.getParameter("openid");
        System.out.println("openid = " + openid);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDatasource());
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Boolean> map = new HashMap<>();
        try {
            User user = new User();
            user = (User) jdbcTemplate.queryForObject("select * from wechat where openid = ?", new BeanPropertyRowMapper<>(user.getClass()), openid);
            map.put("isRegister", true);
        } catch (DataAccessException e) {
            e.printStackTrace();
            map.put("isRegister", false);
        }
        response.getWriter().write(mapper.writeValueAsString(map));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
