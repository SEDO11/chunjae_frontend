package controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/GetApi1")
public class getApi1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String schoolName = request.getParameter("name");

        List<String> ddishList = new ArrayList<>();
        List<String> mlsvList = new ArrayList<>();

        Week week = new Week();

        List<String> date = week.getDate();

        Map<String, Integer> map = new HashMap<>();

        map.put("경인고", 7010563);
        map.put("고척중", 7041168);
        map.put("신구로초", 7041136);

        int minValue = 1;
        int maxValue = 50;

        try {
            // API 엔드포인트 URL
            String apiUrl = "https://open.neis.go.kr/hub/mealServiceDietInfo?KEY=cbdf0211a7d445d9bfd9f7b180cfb42b&Type=xml&pIndex="+minValue+"&pSize="+maxValue+"&ATPT_OFCDC_SC_CODE=B10&SD_SCHUL_CODE="+map.get(schoolName)+"&MLSV_FROM_YMD="+date.get(0)+"&MLSV_TO_YMD="+date.get(1);
            System.out.println(apiUrl);
            // API 요청 보내기
            Document doc = Jsoup.connect(apiUrl).get();

            // ORPLC_INFO 및 MLSV_YMD 태그의 내용 추출
            Elements ddishNmElements = doc.select("DDISH_NM");
            Elements mlsvYmdElements = doc.select("MLSV_YMD");

            // ORPLC_INFO 데이터 출력
            for (Element element : ddishNmElements) {
                String ddishNmData = element.text();
                System.out.println("DDISH_NM 데이터: " + ddishNmData);
                ddishList.add(ddishNmData);
            }

            // MLSV_YMD 데이터 출력
            for (Element element : mlsvYmdElements) {
                String mlsvYmdData = element.text();
                System.out.println("MLSV_YMD 데이터: " + mlsvYmdData);
                mlsvList.add(mlsvYmdData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        request.setAttribute("schoolName", schoolName);
        request.setAttribute("ddishList", ddishList);
        request.setAttribute("mlsvList", mlsvList);

        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
        view.forward(request, response);
    }

}
