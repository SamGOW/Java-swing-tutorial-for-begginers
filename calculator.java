import javax.swing.*;

public class calculator {
    static JLabel lb;
    static StringBuilder strbldr;
    static int rl1,rl2;
    public static void main(String[] args ){
        JFrame frame = new JFrame("calculator");
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btnadd = new JButton("+");
        JButton btneql = new JButton("=");
        strbldr = new StringBuilder();
        lb = new JLabel("0");
        frame.add(panel);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btnadd);
        panel.add(btneql);
        panel.add(lb);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        btn1.addActionListener(e -> {
            String str1 = btn1.getText();
            strbldr.append(str1);
            lb.setText(strbldr.toString());
        });
        btn2.addActionListener(e -> {
            String str1 = btn2.getText();
            strbldr.append(str1);
            lb.setText(strbldr.toString());
        });
        btnadd.addActionListener(e -> {
            String stt = strbldr.toString();
            rl1 = Integer.parseInt(stt);
            strbldr.setLength(0);
            lb.setText(strbldr.toString());
        });
        btneql.addActionListener(e -> {
            String sttt = strbldr.toString();
            rl2 = Integer.parseInt(sttt);
            int result = rl1 + rl2;
            String rll = Integer.toString(result);
            lb.setText(rll);
        });
    }
}
