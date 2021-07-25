

import com.google.common.io.CharStreams;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyApplication extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> params = getParamBody(req);
        String insert = req.getParameter("insert");
        if (insert.equals("categories")) {
            String respCategories = Factory.insertCategories(params.get("CategoryName"), params.get("Description"));
            write(resp, respCategories);
        }
    }

    private static Map<String, String> getParamBody(HttpServletRequest request) {
        try {
            String json = IOUtils.toString(request.getReader());
            Gson gson = new Gson();
            return gson.fromJson(json, Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String load = req.getParameter("load");
        if (load.equals("categories")) {
            String respCategories = Factory.getCategories();
            write(resp, respCategories);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> paramBody = getParamBody(req);

        String update = req.getParameter("update");
        if (update.equals("categories")) {
            String respCategories = Factory.updateCategories(paramBody.get("CategoryID"), paramBody.get("CategoryName"), paramBody.get("Description"));
            write(resp, respCategories);
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> paramBody = getParamBody(req);

        String delete = req.getParameter("delete");
        if (delete.equals("categories")) {
            String respCategories = Factory.deleteCategories(paramBody.get("CategoryID"));
            write(resp, respCategories);
        }
    }

    private void write(HttpServletResponse resp, String message) throws IOException {
        resp.getWriter().write(message);
    }
}
