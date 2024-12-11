import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample {
    // #1. 데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #2. 원하는 정보를 조회하기위한 메서드를 정의 : "모든 고객정보를 조회"
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        // SQl 쿼리 작성
        String query = "select * from 고객";

        // 외부에 있는 데이터베이스 연결하는 과정은 반드시 예외처리를 해줘야 함
        // try~catch 문법을 사용
        // try()를 실행하고 오류가 발생하면 catch구문 실행함
        try (
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println("데이터베이스 연결 성공");
            // 조회 결과가 resultSet에 담겨있음
            // resultSet으로부터 데이터를 꺼내서 Customer클래스의 인스턴스에 저장
            // 생성된 인스턴스들은 List<Customer>에 추가해야 함
            while (resultSet.next()) {
                Customer customer = new Customer();

                customer.setCustomerId(resultSet.getString("고객번호"));
                customer.setCompanyName(resultSet.getString("고객회사명"));
                customer.setContactName(resultSet.getString("담당자명"));
                customer.setContactTitle(resultSet.getString("담당자직위"));
                customer.setAddress(resultSet.getString("주소"));
                customer.setCity(resultSet.getString("도시"));
                customer.setRegion(resultSet.getString("지역"));
                customer.setPhone(resultSet.getString("전화번호"));
                customer.setMileage(resultSet.getInt("마일리지"));

                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // 예외가 발생한 과정의 정보를 출력
        }
        return customers;
    }

    // #3. 원하는 정보를 조회하기위한 메서드를 정의 : "모든 부서정보를 조회"
    public List<Department> getAllDepartment() {
       List<Department> departments = new ArrayList<>();
       String query = "select * from 부서";
       try (
           Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(query)) {
               while (resultSet.next()) {
                   Department department = new Department();

                   department.setDepartmentId(resultSet.getString("부서번호"));
                   department.setDepartmentName(resultSet.getString("부서명"));

                   departments.add(department);
           }

       }catch (SQLException e) {
           e.printStackTrace();
       }
        return departments;
    }

    // #4. 조인쿼리를 사용하는 메서드의 정의
    // 이름, 입사일, 부서명 조회
    // 조인테이블로 결합된 정보가 조회되므로 기존 클래스에 저장 불가
    public void getEmployees_1() {
        // 1) ResultSet의 정보를 그대로 사용함
        // 따로 저장하지 않기 때문에 재사용성이 좋지 않음
        String query = "select 이름, 입사일, 부서명 from 사원 " + "inner join 부서 on 사원.부서번호 = 부서.부서번호";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {
                    while (resultSet.next()) {
                        String name = resultSet.getString("이름");
                        String date = resultSet.getString("입사일");
                        String dept = resultSet.getString("부서명");
                        System.out.println(name + " " + date + " " + dept);
                    }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getEmployees_2() {
        // 2) Map으로 동적 데이터 처리
        // 쿼리결과의 구조가 자바클래스와 일치하지 않고 재사용 예정이라면
        // 데이터를 Map구조(Key, Value)로 저장할 수 있음
        String query = "select 이름, 입사일, 부서명 from 사원 " + "inner join 부서 on 사원.부서번호 = 부서.부서번호";
        List<Map<String, Object>> employees = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    Map<String, Object> employee = new HashMap<>();
                    employee.put("이름", resultSet.getString("이름"));
                    employee.put("입사일", resultSet.getString("입사일"));
                    employee.put("부서명", resultSet.getString("부서명"));
                    employees.add(employee);
            }
                for (Map<String, Object> employee : employees) {
                    System.out.println(employee);
                }
            }catch (SQLException e) {
                e.printStackTrace();
        }
    }

    // #5. 주문기록이 없는 고객의 고객번호와 고객회사명 조회
    public void getCustomersNotOrder() {
        String query = "select 고객.고객번호, 고객회사명  from 고객 " + " left join 주문 on 고객.고객번호 = 주문.고객번호"
                + " where 주문번호 is null";
        List<Map<String, Object>> notOrders = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Map<String, Object> notOrder = new HashMap<>();
                notOrder.put("고객번호", resultSet.getString("고객번호"));
                notOrder.put("고객회사명", resultSet.getString("고객회사명"));
                notOrders.add(notOrder);
            }
            for (Map<String, Object> notOrder : notOrders) {
                System.out.println(notOrder);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getCustomersNotOrder_2() {
        String query = "select 고객.고객번호, 고객회사명 from 고객 " + "left join 주문 on 고객.고객번호 = 주문.고객번호"
                + " where 주문번호 is null";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                String date = resultSet.getString("고객번호");
                String dept = resultSet.getString("고객회사명");
                System.out.println(date + " " + dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MysqlJdbcExample repository = new MysqlJdbcExample();
        // List<Customer> customers = repository.getAllCustomers();
//        List<Department> departments = repository.getAllDepartment();
//        System.out.println(departments.size());
//        for (Department department : departments) {
//            System.out.println(department);
//        }
//        System.out.println(customers.size());
//        for (Customer customer : customers) {
//            System.out.println(customer);
//        }
//          repository.getEmployees_1();
//          repository.getEmployees_2();
//          repository.getCustomersNotOrder();
//          repository.getCustomersNotOrder_2();
    }
}
