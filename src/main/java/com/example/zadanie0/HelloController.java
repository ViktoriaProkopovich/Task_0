package com.example.zadanie0;

import com.example.zadanie0.model.Procent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label b;
    @FXML
    private Label s;
    @FXML
    private Label m;
    @FXML
    private Button big;
    @FXML
    private Button sred;
    @FXML
    private Button mal;
    @FXML
    private TextField summa;

    private Procent pro = new Procent();

    @FXML
    protected void Click1() {
        double sum;
        double cent;
        cent = pro.setprocent(15.0);
        sum = pro.setsumma(Double.parseDouble(summa.getText()));

        b.setText(String.valueOf(pro.calc(sum,cent)));
    }
    @FXML
    protected void Click2() {
        double sum;
        double cent;
        cent = pro.setprocent(10.0);
        sum = pro.setsumma(Double.parseDouble(summa.getText()));

        s.setText(String.valueOf(pro.calc(sum,cent)));
    }
    @FXML
    protected void Click3() {
        double sum;
        double cent;
        cent = pro.setprocent(3.0);
        sum = pro.setsumma(Double.parseDouble(summa.getText()));

        m.setText(String.valueOf(pro.calc(sum,cent)));
    }
}