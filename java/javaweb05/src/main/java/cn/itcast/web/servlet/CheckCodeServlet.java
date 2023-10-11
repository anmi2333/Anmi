package cn.itcast.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Random;

/**
 * @projectName: javaweb05
 * @package: cn.itcast.web.servlet
 * @className: CheckCodeServlet
 * @NAME: WANG CHAO
 * @date: 2023/08/16 10:26
 */
@SuppressWarnings({"all"})
@WebServlet("/checkCodeServlet")
public class CheckCodeServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int width = 100;
        int height = 100;
        //1.创建一个对象 在内存中画图
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //2.美化图片
        //2.1
        Graphics g = image.getGraphics();
        g.setColor(Color.PINK);
        g.fillRect(0,0,width,height);

        //2.2
        g.setColor(Color.BLUE);
        g.drawRect(0,0,width -1,height -1);

        //2.3
        String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghighlmnopqrstuvwxyz0123456789";
        //生成随机角标
        Random ran = new Random();
        for (int i = 1; i <= 4; i++) {
            int index = ran.nextInt(str.length());
            //获取字符
            char ch = str.charAt(index);//随机字符
            //2.4 写验证码
            g.drawString(ch+"",width/5*i,width/2);
        }

        //2.5画干扰线
        g.setColor(Color.GREEN);
        //随机生成坐标点
        for (int i = 1; i <= 10; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            g.drawLine(x1,x2,y1,y2);
        }

        //3.将图片输出到页面展示
        String formatName;
        ImageIO.write(image,formatName="jpg",resp.getOutputStream());
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
