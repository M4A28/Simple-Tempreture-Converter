import javax.swing.JFrame;
public class Test extends JFrame {
    public static void main(String...args) {
        TempretureConverter tempretureConverter = new TempretureConverter();
        tempretureConverter.setSize(380, 160);
        tempretureConverter.setVisible(true);
        tempretureConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
