
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

class SwingPrac1 extends JFrame {

   Container container = getContentPane();
   
   // 선언
   
   /* 개인정보 선언 시작*/
   JPanel infoAreaPanel = new JPanel(); // 개인정보 전체 패널
   JPanel namePanel = new JPanel();
   JPanel numberPanel = new JPanel();
   JPanel phonePanel = new JPanel();
   JPanel addressPanel = new JPanel();
   
   // 개인정보 Label
   JLabel nameLb = new JLabel("이름:");
   JLabel numberLb = new JLabel("주민번호:");
   JLabel phoneLb = new JLabel("전화번호:");
   JLabel addressLb = new JLabel("주소:");
   
   // 개인정보 TextField
   JTextField nameTf = new JTextField();
   JTextField number1Tf = new JTextField();
   JTextField number2Tf = new JTextField();
   JTextField phoneTf = new JTextField();
   JTextField addressTf = new JTextField();
   /* 개인정보 선언 끝 */   
   
   
   /* 정보검색 선언 시작 */
   JPanel searchAreaPanel = new JPanel(); // 정보검색 전체 패널
   JPanel searchInputPanel = new JPanel();
   JPanel searchBtnPanel = new JPanel();
   
   JLabel searchLb = new JLabel("검색:");

   JTextField search1Tf = new JTextField(7);
   JTextField search2Tf = new JTextField(7);

   JTextArea searchTa = new JTextArea();
   JScrollPane searchScPane = new JScrollPane(searchTa);

   JButton searchBtn = new JButton("검색");
   JButton searchPrevBtn = new JButton("<<");
   JButton searchNextBtn = new JButton(">>");   
   /* 정보검색 선언 끝 */   
   
   
   // 개인정보+정보검색 패널
   JPanel bindAreaPanel = new JPanel();   
   
   
   /* 개인정보확인 선언 시작 */
   JTextArea viewTa = new JTextArea();
   JScrollPane viewScPane = new JScrollPane(viewTa);
   
   JPanel viewAreaPanel = new JPanel(); // 개인정보확인 전체 패널
   JPanel viewAllPanel = new JPanel();
   JPanel viewBtnPanel = new JPanel();   
   
   JLabel viewAllLb = new JLabel("<== 이것을 누르면 전체보기가 됩니다.");
   
   JButton viewBtn = new JButton("전체보기");

   JButton inputBtn = new JButton("등록");
   JButton modifyBtn = new JButton("수정");
   JButton deleteBtn = new JButton("삭제");
   JButton clearBtn = new JButton("Clear");
   JButton saveBtn = new JButton("저장");
   JButton loadBtn = new JButton("로드");
   JButton exitBtn = new JButton("종료");
   /* 개인정보확인 선언 끝 */
   
   public SwingPrac1() {
      setTitle("사용자 관리");
      setSize(800, 400);
      // 윈도우 창을 화면의 가운데에 띄우는 역할을 한다
      setLocationRelativeTo(null);
      init();
      start();
      setVisible(true);
   }
   
   private void init() {      
      /* 전체 레이아웃 시작 */
      container.setLayout(new BorderLayout());
      container.add("West", bindAreaPanel); // 개인정보 패널+정보검색 패널
      container.add("Center", viewAreaPanel); // 개인정보확인 패널
      
      bindAreaPanel.setLayout(new GridLayout(2, 1)); // 개인정보 패널+정보검색 패널 (2행 1열)
      bindAreaPanel.add(infoAreaPanel);
      bindAreaPanel.add(searchAreaPanel);
      /* 전체 레이아웃 끝 */
      
      
      /* 개인정보 패널 시작 */
      infoAreaPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new TitledBorder("개인정보")));
      infoAreaPanel.setLayout(new GridLayout(4, 1));
      
      infoAreaPanel.add(namePanel);
      infoAreaPanel.add(numberPanel);
      infoAreaPanel.add(phonePanel);
      infoAreaPanel.add(addressPanel);
      
      namePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      namePanel.add(nameLb);
      namePanel.add(nameTf);
      // textField의 기본 크기를 설정합니다
      nameTf.setPreferredSize(new Dimension(165, 30));
      
      numberPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      numberPanel.add(numberLb);
      numberPanel.add(number1Tf);
      numberPanel.add(number2Tf);
      number1Tf.setPreferredSize(new Dimension(80, 30));
      number2Tf.setPreferredSize(new Dimension(80, 30));
      
      phonePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      phonePanel.add(phoneLb);
      phonePanel.add(phoneTf);
      phoneTf.setPreferredSize(new Dimension(165, 30));
      
      
      addressPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      addressPanel.add(addressLb);
      addressPanel.add(addressTf);
      addressTf.setPreferredSize(new Dimension(165, 30));
      /* 개인정보 패널 끝 */
      
      
      /* 정보검색 패널 시작 */
      searchAreaPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new TitledBorder("정보검색")));
      searchAreaPanel.setLayout(new BorderLayout());
      searchAreaPanel.add("North", searchInputPanel);
      searchAreaPanel.add("Center", searchScPane);
      searchAreaPanel.add("South", searchBtnPanel);
      
      // layout을 설정하지 않으면, 기본 layout은 FlowLayout
      searchInputPanel.setLayout(new FlowLayout());
      searchInputPanel.add(searchLb);
      searchInputPanel.add(search1Tf);
      searchInputPanel.add(search2Tf);
      searchInputPanel.add(searchBtn);
      searchBtn.setMargin(new Insets(0, 0, 0, 0));
      searchBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      
      searchBtnPanel.add(searchPrevBtn);
      searchBtnPanel.add(searchNextBtn);
      searchPrevBtn.setMargin(new Insets(0, 0, 0, 0));
      searchNextBtn.setMargin(new Insets(0, 0, 0, 0));
      
      searchPrevBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      searchNextBtn.setBorder(new BevelBorder(BevelBorder.RAISED));

      // 버튼 비활성화
      searchBtn.setEnabled(false);
      searchPrevBtn.setEnabled(false);
      searchNextBtn.setEnabled(false);
      /* 정보검색 패널 끝 */
      
      
      
      /* 개인정보확인 패널 시작 */
      viewAreaPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new TitledBorder("개인정보확인")));
      viewAreaPanel.setLayout(new BorderLayout());
      viewAreaPanel.add("North", viewAllPanel);
      viewAreaPanel.add("Center", viewScPane);
      viewAreaPanel.add("South", viewBtnPanel);
      
      viewAllPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
      viewAllPanel.add(viewBtn);
      viewAllPanel.add(viewAllLb);
      viewBtn.setMargin(new Insets(0, 0, 0, 0));
      viewBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      
      viewBtnPanel.setLayout(new GridLayout(1, 7, 3, 0));
      viewBtnPanel.add(inputBtn);
      viewBtnPanel.add(modifyBtn);
      viewBtnPanel.add(deleteBtn);
      viewBtnPanel.add(clearBtn);
      viewBtnPanel.add(saveBtn);
      viewBtnPanel.add(loadBtn);
      viewBtnPanel.add(exitBtn);
      
      inputBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      modifyBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      deleteBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      clearBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      saveBtn.setBorder(new BevelBorder(BevelBorder.RAISED));
      
      // 버튼 비활성화
      viewBtn.setEnabled(false);
      inputBtn.setEnabled(false);
      modifyBtn.setEnabled(false);
      deleteBtn.setEnabled(false);
      clearBtn.setEnabled(false);
      saveBtn.setEnabled(false);
      /* 개인정보확인 패널 끝 */
   }
   
   private void start() {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}

public class Practice1 {
   public static void main(String[] args) {
      SwingPrac1 sp1 = new SwingPrac1();
   }
}
