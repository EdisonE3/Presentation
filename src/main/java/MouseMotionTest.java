import javax.swing.*;
import java.awt.*;

public class MouseMotionTest extends JFrame {

    private JLabel jLabel1;
    private JLabel jLabel2;

    //在无参构造函数中初始化相关组件
    public MouseMotionTest() {
        jLabel1 = new JLabel("请移动鼠标");
        jLabel2 = new JLabel("请拖动鼠标");

        this.add(jLabel1, BorderLayout.NORTH);
        this.add(jLabel2, BorderLayout.SOUTH);
        //设置监听事件
        this.addMouseMotionListener(new MyListener());

        //设置窗体的基本信息
        this.setTitle("鼠标移动和拖动测试");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
