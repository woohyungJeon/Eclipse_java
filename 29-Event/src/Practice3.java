import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Form33 extends Frame implements ActionListener {
   // 선언
   // Frame
   BorderLayout borderLayout = new BorderLayout();
   // 패널
   Panel panel1 = new Panel();
   Panel panel2 = new Panel();
   
   //FlowLayout flowLayout = new FlowLayout();
   GridLayout gridLayout1 = new GridLayout(1, 2);
   GridLayout gridLayout2 = new GridLayout(2, 1);
   
   Button button1 = new Button("Test");
   Button button2 = new Button("Test1");
   Button button3 = new Button("Test2");

   public Form33() {
      setTitle("");
      setSize(300, 200);
      setLocation(700, 300);

      init();
      start();

      setVisible(true);
   }

   // 화면 구성
   private void init() {
      // frame 구성
      setLayout(borderLayout);
      add("South", panel1);
      
      // panel 구성
      button1.setBackground(Color.YELLOW); 
      
      panel1.setLayout(gridLayout1);
      panel1.add(button1);
      panel1.add(panel2);
      
      // 패널2
      button2.setBackground(Color.PINK);
      button3.setBackground(Color.GREEN);
      
      panel2.setLayout(gridLayout2);
      panel2.add(button2);
      panel2.add(button3);
   }

   // 이벤트 처리
   private void start() {
      button1.addActionListener(this);
      button2.addActionListener(this);
      button3.addActionListener(this);
      
      // x버튼 이벤트 처리
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Dialog dialog = new Dialog(this);
      dialog.setLocation(800, 400);
      dialog.setSize(100, 40);
      
      if(e.getSource() == button1) {
         dialog.setTitle("Test");
         dialog.setVisible(true);
      } else if(e.getSource() == button2) {
         dialog.setTitle("Test1");
         dialog.setVisible(true);
      } else if(e.getSource() == button3) {
         dialog.setTitle("Test2");
         dialog.setVisible(true);
      }
      
      // dialog의 x버튼 이벤트 처리
      dialog.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            dialog.dispose();
         }
      });
   }
}

public class Practice3 {
   public static void main(String[] args) {
      Form33 form33 = new Form33();
   }
}