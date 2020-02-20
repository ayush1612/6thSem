import javax.swing.*;
// import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
// import javax.swing.SpringLayout;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentDetails implements ActionListener {
    ArrayList<Student> arr = new ArrayList<Student>();
    JFrame frm;
    JLabel jl1 = new JLabel("Enter name");
    JLabel jl2 = new JLabel("Enter USN");
    JLabel jl3 = new JLabel("Enter the age");
    JLabel jl4 = new JLabel("Enter the address");
    JLabel jl51 = new JLabel("SGPA of sem 1");
    JLabel jl52 = new JLabel("SGPA of sem 2");
    JLabel jl53 = new JLabel("SGPA of sem 3");
    JLabel jl54 = new JLabel("SGPA of sem 4");
    JLabel jl55 = new JLabel("SGPA of sem 5");
    JLabel jl56 = new JLabel("SGPA of sem 6");
    JLabel jl57 = new JLabel("SGPA of sem 7");
    JLabel jl58 = new JLabel("SGPA of sem 8");
    JLabel jl6 = new JLabel("Enter the category");

    JTextField jt1 = new JTextField(20);
    JTextField jt2 = new JTextField(10);
    JTextField jt3 = new JTextField(5);
    JTextField jt4 = new JTextField(30);
    JTextField jt51 = new JTextField(5);
    JTextField jt52 = new JTextField(5);
    JTextField jt53 = new JTextField(5);
    JTextField jt54 = new JTextField(5);
    JTextField jt55 = new JTextField(5);
    JTextField jt56 = new JTextField(5);
    JTextField jt57 = new JTextField(5);
    JTextField jt58 = new JTextField(5);
    JTextField jt6 = new JTextField(20);

    JPanel jp3 = new JPanel();

    String name;
    String usn;
    int age;
    String address;
    double sgpa[];
    String category;

    JButton jb = new JButton("Confirm");
    StudentDetails sd;
    JTextArea ja = new JTextArea(15, 30);

    StudentDetails() {
        frm = new JFrame("Welcome to Student Details");

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jl1.setBou
        // frm.add(jp1);
        // jp1.add(jl1);
        // jp1.add(jt1);
        frm.add(jl1);
        frm.add(jt1);
        frm.add(jl2);
        frm.add(jt2);
        frm.add(jl3);
        frm.add(jt3);
        frm.add(jl4);
        frm.add(jt4);
        frm.add(jl51);
        frm.add(jt51);
        frm.add(jl52);
        frm.add(jt52);
        frm.add(jl53);
        frm.add(jt53);
        frm.add(jl54);
        frm.add(jt54);
        frm.add(jl55);
        frm.add(jt55);
        frm.add(jl56);
        frm.add(jt56);
        frm.add(jl57);
        frm.add(jt57);
        frm.add(jl58);
        frm.add(jt58);
        frm.add(jl6);
        frm.add(jt6);
        frm.add(jp3);
        jp3.add(jb);
        jb.addActionListener(this);
        frm.add(ja);

        frm.setVisible(true);
        frm.setSize(400, 500);
        frm.setLayout(new FlowLayout());
        // frm.setLayout(null);
    }

    public void actionPerformed(ActionEvent evt) {

        name = jt1.getText();
        usn = jt2.getText();
        age = Integer.parseInt(jt3.getText());
        address = jt4.getText();
        sgpa = new double[8];
        sgpa[0] = Double.parseDouble(jt51.getText());
        sgpa[1] = Double.parseDouble(jt52.getText());
        sgpa[2] = Double.parseDouble(jt53.getText());
        sgpa[3] = Double.parseDouble(jt54.getText());
        sgpa[4] = Double.parseDouble(jt55.getText());
        sgpa[5] = Double.parseDouble(jt56.getText());
        sgpa[6] = Double.parseDouble(jt57.getText());
        sgpa[7] = Double.parseDouble(jt58.getText());

        category = jt6.getText();

        Student s = new Student(name,usn,age,address,sgpa,category);
        arr.add(s);
        Font f = new Font("Arial",Font.PLAIN,13);
        ja.setFont(f);
        String res = "";
        for(Student itr:arr){
            System.out.println(itr);
            res = res + itr;
        }
        ja.setText(res);

    }

    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();

    }
}