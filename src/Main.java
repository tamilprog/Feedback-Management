import ui.MainWindow;

public class Main {  // must be public
    public static void main(String[] args) {  // must be public static
        javax.swing.SwingUtilities.invokeLater(() -> new MainWindow().setVisible(true));
    }
}
