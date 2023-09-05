package controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> ddishList = new ArrayList<>();
        List<String> mlsvList = new ArrayList<>();

        List<String> date = Week();

        Map<String, Integer> map = new HashMap<>();

        String schoolName = "신구로초";
        map.put("경인고", 7010563);
        map.put("고척중", 7041168);
        map.put("신구로초", 7041136);

        try {
            // API 엔드포인트 URL
            String apiUrl = "https://open.neis.go.kr/hub/mealServiceDietInfo?KEY=cbdf0211a7d445d9bfd9f7b180cfb42b&Type=xml&pIndex=1&pSize=5&ATPT_OFCDC_SC_CODE=B10&SD_SCHUL_CODE="+map.get(schoolName)+"&MLSV_FROM_YMD="+date.get(0)+"&MLSV_TO_YMD="+date.get(1);
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

    public List<String> Week() {
        // 오늘 날짜 가져오기
        LocalDate today = LocalDate.now();

        List<String> date = new ArrayList<>();

        // 이번 주의 월요일 날짜 계산
        LocalDate monday = today;
        while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
            monday = monday.minusDays(1);
        }

        // 이번 주의 금요일 날짜 계산
        LocalDate friday = today;
        while (friday.getDayOfWeek() != DayOfWeek.FRIDAY) {
            friday = friday.plusDays(1);
        }

        // 날짜를 yyyyMMdd 형식으로 포맷팅
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String todayFormatted = today.format(formatter);
        String mondayFormatted = monday.format(formatter);
        String fridayFormatted = friday.format(formatter);

        // 결과 출력
        System.out.println("오늘 날짜: " + todayFormatted);
        System.out.println("이번 주 월요일: " + mondayFormatted);
        System.out.println("이번 주 금요일: " + fridayFormatted);

        // 저번 주 월요일과 금요일 날짜 계산
        LocalDate lastMonday = monday.minusWeeks(1);
        LocalDate lastFriday = friday.minusWeeks(1);
        String lastMondayFormatted = lastMonday.format(formatter);
        String lastFridayFormatted = lastFriday.format(formatter);

        // 결과 출력
        System.out.println("저번 주 월요일: " + lastMondayFormatted);
        System.out.println("저번 주 금요일: " + lastFridayFormatted);
        date.add(lastMondayFormatted);
        date.add(lastFridayFormatted);
        return date;
    }
}
