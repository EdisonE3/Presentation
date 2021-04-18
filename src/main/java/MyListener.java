import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class MyListener implements MouseMotionListener {

    //当鼠标拖动时调用此方法
    public void mouseDragged(MouseEvent e) {
        //得到鼠标位置的x坐标
        int x = e.getX();
        //得到鼠标的y坐标
        int y = e.getY();
        //将鼠标坐标信息显示到北边的标签中
        String str = "正在拖动鼠标X:" + x + ";Y:" + y;
        System.out.println(str);
    }

    //鼠标移动时调用此方法
    public void mouseMoved(MouseEvent e) {
        //得到鼠标位置的x坐标
        int x = e.getX();
        //得到鼠标位置的y坐标
        int y = e.getY();
        //将鼠标坐标信息显示到北边的标签中
        String str = "正在移动鼠标X:" + x + ";Y:" + y;
        System.out.println(str);
    }

}
