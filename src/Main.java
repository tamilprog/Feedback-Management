import ui.MainWindow;
import db.DBManager;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DBManager.getConnection()) {
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(() -> new MainWindow().setVisible(true));
    }
}
