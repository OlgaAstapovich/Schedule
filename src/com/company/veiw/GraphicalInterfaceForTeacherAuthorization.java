package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class GraphicalInterfaceForTeacherAuthorization extends JFrame{
    void authorization(){
    }

    private JLabel loginLabel = new JLabel("Логин:");
    private JLabel passwordLabel = new JLabel("Пароль:");
    private JTextField loginInput = new JTextField();
    private JPasswordField passwordInput = new JPasswordField();
    private JButton okButton = new JButton("Ок");

    public GraphicalInterfaceForTeacherAuthorization(){
        super("Авторизация");
        setBounds(400,50, 400, 240);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.loginLabel.setBounds(70, 30, 100, 30);
        this.passwordLabel.setBounds(70, 80, 100, 30);
        this.loginInput.setBounds(200, 30, 150, 30);
        this.passwordInput.setBounds(200, 80, 150, 30);
        this.okButton.setBounds(140, 150, 100, 30);

        container.add(this.loginLabel);
        container.add(this.passwordLabel);
        container.add(this.loginInput);
        container.add(this.passwordInput);
        container.add(this.okButton);
    }

}
