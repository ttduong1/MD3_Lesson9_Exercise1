package rikkei.academy;

import java.util.Calendar;


public class NextDayCalculator {
    public static String getNextDay(String timeiput) {

        String dateInput = timeiput;

        // Tách ngày, tháng, năm từ chuỗi người dùng nhập vào
        int day = Integer.parseInt(dateInput.substring(0, 2));
        int month = Integer.parseInt(dateInput.substring(3, 5));
        int year = Integer.parseInt(dateInput.substring(6));

        // Tạo đối tượng Calendar và đặt ngày, tháng, năm tương ứng
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);

        // Thêm một ngày vào ngày hiện tại
        calendar.add(Calendar.DAY_OF_YEAR, 1);

        // Lấy ngày, tháng, năm mới
        int nextDay = calendar.get(Calendar.DAY_OF_MONTH);
        int nextMonth = calendar.get(Calendar.MONTH) + 1;
        int nextYear = calendar.get(Calendar.YEAR);

        // Hiển thị ngày tiếp theo
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }
}
