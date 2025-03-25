import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_krottmaier {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/itl12_datenbank_krottmaier";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            //Alles aus der Tabelle EMP
            String query1 = "SELECT * FROM emp";
            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(query1);

            while (resultSet1.next()) {
                int empNo = resultSet1.getInt("empno");
                String eName = resultSet1.getString("ename");
                String job = resultSet1.getString("job");
                System.out.println("empno: " + empNo + ", ename: " + eName + ", job: " + job);
            }

            //Alles aus der Tabelle DEPT
            String query2 = "SELECT * FROM dept";
            Statement statement2 = connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery(query2);

            while (resultSet2.next()) {
                int deptNo = resultSet2.getInt("deptno");
                String dName = resultSet2.getString("dname");
                String loc = resultSet2.getString("loc");
                System.out.println("deptno: " + deptNo + ", dname: " + dName + ", loc: " + loc);
            }

            // Alles aus der Tabelle SALGRADE
            String query3 = "SELECT * FROM salgrade";
            Statement statement3 = connection.createStatement();
            ResultSet resultSet3 = statement3.executeQuery(query3);

            while (resultSet3.next()) {
                int grade = resultSet3.getInt("grade");
                int losal = resultSet3.getInt("losal");
                int hisal = resultSet3.getInt("hisal");
                System.out.println("grade: " + grade + ", losal: " + losal + ", hisal: " + hisal);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
