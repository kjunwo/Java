import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample_4 {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #1. 재고수량을 매개변수로 전달하고 재고수량 미만인 제품의 제품번호,제품명,총주문건수 조회
    // Map을 사용하여 메서드내에서 출력하도록 구현
    public void getProductsWithStock(int stock) {
        String query = "select 제품.제품번호, 제품명, (select count(*) from 주문세부 where 주문세부.제품번호 = 제품.제품번호) as 총주문건수 from 제품 " +
                " where 제품.재고 <= ?";
        List<Map<String, Object>> withStocks = new ArrayList<>();
        try (Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)){
             pstmt.setInt(1, stock);
            try (ResultSet resultSet = pstmt.executeQuery()){
                while (resultSet.next()){
                    Map<String, Object> withStock = new HashMap<>();
                    withStock.put("제품번호",resultSet.getInt("제품번호"));
                    withStock.put("제품명", resultSet.getString("제품명"));
                    withStock.put("총주문건수", resultSet.getInt("총주문건수"));
                    withStocks.add(withStock);
                }
                for (Map<String,Object> map : withStocks) {
                    System.out.println(map);
                }
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // #2. 매개변수로 날짜(date)와 기간(개월수)(month)를 전달하고 해당 날짜를
    // 기준으로 개월수이내의 주문정보를 골라 아래 컬럼을 조회
    // 예를들어, 2022-02-01 기준으로 3개월 이내의 주문정보
    // 사원번호, 이름, 직위
    public void getEmployeesWithDuration(String date, int month) {
        String query = "select 사원번호, 이름, 직위 from 사원 where 사원번호 in (select 사원번호 from 주문 where 주문일 >= adddate(?, interval ? month))";

        List<Map<String, Object>> Durations = new ArrayList<>();
        try (Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1, date);
            pstmt.setInt(2, month);
            try (ResultSet resultSet = pstmt.executeQuery()){
                while (resultSet.next()){
                    Map<String, Object> Duration = new HashMap<>();
                    Duration.put("사원번호", resultSet.getString("사원번호"));
                    Duration.put("이름", resultSet.getString("이름"));
                    Duration.put("직위", resultSet.getString("직위"));
                    Durations.add(Duration);
                }
                for (Map<String,Object> map : Durations) {
                    System.out.println(map);
                }
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // #3. 매개변수로 도시를 전달하고 해당도시별 고객들에 대한 주문년도별 주문건수 조회
    public void getNumOfOrdersByCity(String city) {
        String query = "select year(주문일) as 주문년도, count(*) as 주문건수 from 주문 where 고객번호 in (select 고객번호 from 고객 where 도시 = ?) group by 주문년도";

        List<Map<String, Object>> ByCitys = new ArrayList<>();
        try (Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1, city);
            try (ResultSet resultSet = pstmt.executeQuery()){
                while (resultSet.next()){
                    Map<String, Object> ByCity = new HashMap<>();
                    ByCity.put("주문년도", resultSet.getString("주문년도"));
                    ByCity.put("주문건수", resultSet.getString("주문건수"));
                    ByCitys.add(ByCity);
                }
                for (Map<String,Object> map : ByCitys) {
                    System.out.println(map);
                }
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MysqlJdbcExample_4 repository = new MysqlJdbcExample_4();
//        repository.getProductsWithStock(4);
//        repository.getEmployeesWithDuration("2022-02-01", -3);
        repository.getNumOfOrdersByCity("서울특별시");
    }
}
