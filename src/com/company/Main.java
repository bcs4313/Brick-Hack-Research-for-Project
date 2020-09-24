package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class main {
    public static void main(String[] args) {
        Init i = new Init();
        i.constructMap();
    }
}
class Init
{
    public void constructMap()
    {
        // Create main window
        JFrame window = new JFrame();
        window.setSize(1024,576);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout c = new GridBagLayout(); // constraint system
        GridBagConstraints gbc = new GridBagConstraints();
        window.setLayout(c);

        JButton cbut = new JButton();
        cbut.setText("Create a Company");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        cbut.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cbut.setText("Alex is Gay");
            }
        });
        window.add(cbut,gbc);

        JButton pbut = new JButton();
        pbut.setText("Create a PowerPlant");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(pbut,gbc);
        window.setVisible(true);

        JButton cubut = new JButton();
        cubut.setText("Create a Customer");
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        window.add(cubut,gbc);
        window.setVisible(true);
    }
    public void createGridPart()
    {

    }
}