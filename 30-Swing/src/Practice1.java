
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
   
   // ����
   
   /* �������� ���� ����*/
   JPanel infoAreaPanel = new JPanel(); // �������� ��ü �г�
   JPanel namePanel = new JPanel();
   JPanel numberPanel = new JPanel();
   JPanel phonePanel = new JPanel();
   JPanel addressPanel = new JPanel();
   
   // �������� Label
   JLabel nameLb = new JLabel("�̸�:");
   JLabel numberLb = new JLabel("�ֹι�ȣ:");
   JLabel phoneLb = new JLabel("��ȭ��ȣ:");
   JLabel addressLb = new JLabel("�ּ�:");
   
   // �������� TextField
   JTextField nameTf = new JTextField();
   JTextField number1Tf = new JTextField();
   JTextField number2Tf = new JTextField();
   JTextField phoneTf = new JTextField();
   JTextField addressTf = new JTextField();
   /* �������� ���� �� */   
   
   
   /* �����˻� ���� ���� */
   JPanel searchAreaPanel = new JPanel(); // �����˻� ��ü �г�
   JPanel searchInputPanel = new JPanel();
   JPanel searchBtnPanel = new JPanel();
   
   JLabel searchLb = new JLabel("�˻�:");

   JTextField search1Tf = new JTextField(7);
   JTextField search2Tf = new JTextField(7);

   JTextArea searchTa = new JTextArea();
   JScrollPane searchScPane = new JScrollPane(searchTa);

   JButton searchBtn = new JButton("�˻�");
   JButton searchPrevBtn = new JButton("<<");
   JButton searchNextBtn = new JButton(">>");   
   /* �����˻� ���� �� */   
   
   
   // ��������+�����˻� �г�
   JPanel bindAreaPanel = new JPanel();   
   
   
   /* ��������Ȯ�� ���� ���� */
   JTextArea viewTa = new JTextArea();
   JScrollPane viewScPane = new JScrollPane(viewTa);
   
   JPanel viewAreaPanel = new JPanel(); // ��������Ȯ�� ��ü �г�
   JPanel viewAllPanel = new JPanel();
   JPanel viewBtnPanel = new JPanel();   
   
   JLabel viewAllLb = new JLabel("<== �̰��� ������ ��ü���Ⱑ �˴ϴ�.");
   
   JButton viewBtn = new JButton("��ü����");

   JButton inputBtn = new JButton("���");
   JButton modifyBtn = new JButton("����");
   JButton deleteBtn = new JButton("����");
   JButton clearBtn = new JButton("Clear");
   JButton saveBtn = new JButton("����");
   JButton loadBtn = new JButton("�ε�");
   JButton exitBtn = new JButton("����");
   /* ��������Ȯ�� ���� �� */
   
   public SwingPrac1() {
      setTitle("����� ����");
      setSize(800, 400);
      // ������ â�� ȭ���� ����� ���� ������ �Ѵ�
      setLocationRelativeTo(null);
      init();
      start();
      setVisible(true);
   }
   
   private void init() {      
      /* ��ü ���̾ƿ� ���� */
      container.setLayout(new BorderLayout());
      container.add("West", bindAreaPanel); // �������� �г�+�����˻� �г�
      container.add("Center", viewAreaPanel); // ��������Ȯ�� �г�
      
      bindAreaPanel.setLayout(new GridLayout(2, 1)); // �������� �г�+�����˻� �г� (2�� 1��)
      bindAreaPanel.add(infoAreaPanel);
      bindAreaPanel.add(searchAreaPanel);
      /* ��ü ���̾ƿ� �� */
      
      
      /* �������� �г� ���� */
      infoAreaPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new TitledBorder("��������")));
      infoAreaPanel.setLayout(new GridLayout(4, 1));
      
      infoAreaPanel.add(namePanel);
      infoAreaPanel.add(numberPanel);
      infoAreaPanel.add(phonePanel);
      infoAreaPanel.add(addressPanel);
      
      namePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
      namePanel.add(nameLb);
      namePanel.add(nameTf);
      // textField�� �⺻ ũ�⸦ �����մϴ�
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
      /* �������� �г� �� */
      
      
      /* �����˻� �г� ���� */
      searchAreaPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new TitledBorder("�����˻�")));
      searchAreaPanel.setLayout(new BorderLayout());
      searchAreaPanel.add("North", searchInputPanel);
      searchAreaPanel.add("Center", searchScPane);
      searchAreaPanel.add("South", searchBtnPanel);
      
      // layout�� �������� ������, �⺻ layout�� FlowLayout
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

      // ��ư ��Ȱ��ȭ
      searchBtn.setEnabled(false);
      searchPrevBtn.setEnabled(false);
      searchNextBtn.setEnabled(false);
      /* �����˻� �г� �� */
      
      
      
      /* ��������Ȯ�� �г� ���� */
      viewAreaPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED), new TitledBorder("��������Ȯ��")));
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
      
      // ��ư ��Ȱ��ȭ
      viewBtn.setEnabled(false);
      inputBtn.setEnabled(false);
      modifyBtn.setEnabled(false);
      deleteBtn.setEnabled(false);
      clearBtn.setEnabled(false);
      saveBtn.setEnabled(false);
      /* ��������Ȯ�� �г� �� */
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
