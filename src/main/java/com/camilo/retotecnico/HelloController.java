package com.camilo.retotecnico;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;


public class HelloController {

    //Lineas de Selección --------------------*

    @FXML private Line initLine;
    @FXML private Line profileLine;

    //Páneles --------------------*

    @FXML private AnchorPane initPanel;
    @FXML private AnchorPane profilePanel;
    @FXML private AnchorPane comercialPanel;
    @FXML private AnchorPane comercialPanel2;
    @FXML private AnchorPane deliveryPanel;
    @FXML private AnchorPane deliveryPanel2;

    //Parámetros --------------------*

    @FXML private TextField comercialName;
    @FXML private TextField comercialAge;
    @FXML private TextField comercialSalary;
    @FXML private TextField comercialComision;
    @FXML private TextField deliveryName;
    @FXML private TextField deliveryAge;
    @FXML private TextField deliverySalary;
    @FXML private TextField deliveryZone;

    //Labels (Returns) --------------------*

    @FXML private Label comercialLabel1;
    @FXML private Label comercialLabel2;
    @FXML private Label deliveryLabel1;
    @FXML private Label deliveryLabel2;


    //Eventos de Click --------------------*

    @FXML
    public void onExitButtonClicked(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    @FXML
    public void onInitButtonCLicked(MouseEvent event){
        initPanel.setVisible(true);
        initLine.setVisible(true);

        profileLine.setVisible(false);
        profilePanel.setVisible(false);
        comercialPanel.setVisible(false);
    }

    @FXML
    public void onProfileButtonCLicked(MouseEvent event){
        profileLine.setVisible(true);
        profilePanel.setVisible(true);

        initLine.setVisible(false);
        initPanel.setVisible(false);

    }

    @FXML
    public void onComercialClicked(MouseEvent event){
        comercialPanel.setVisible(true);

        profilePanel.setVisible(false);
    }

    @FXML
    public void onDeliveryClicked(MouseEvent event){
        deliveryPanel.setVisible(true);

        comercialPanel.setVisible(false);
        profilePanel.setVisible(false);
    }

    //Envío de formulario y agregación de eventos --------------------*

    @FXML
    public void onSendClicked(MouseEvent event){
        comercialPanel2.setVisible(true);

        comercialPanel.setVisible(false);
        deliveryPanel.setVisible(false);
        deliveryPanel.setVisible(false);

        String nombre = comercialName.getText();
        int edad = Integer.valueOf(comercialAge.getText());
        double salario = Double.valueOf(comercialSalary.getText());
        double comision = Double.valueOf(comercialComision.getText());

        Comercial comercial = new Comercial(nombre, edad, salario, comision);
        comercialLabel1.setText(comercial.aplicaBonificacion());
        comercialLabel2.setText(comercial.toString());
    }

    @FXML
    public void onSendClickedDelivery(MouseEvent event){
        deliveryPanel2.setVisible(true);


        comercialPanel.setVisible(false);
        comercialPanel2.setVisible(false);
        deliveryPanel.setVisible(false);
        deliveryPanel.setVisible(false);

        String nombre = deliveryName.getText();
        int edad = Integer.valueOf(deliveryAge.getText());
        double salario = Double.valueOf(deliverySalary.getText());
        int zona = Integer.valueOf(deliveryZone.getText());

        Repartidor repartidor = new Repartidor(nombre, edad, salario, zona);
        deliveryLabel1.setText(repartidor.aplicaBonificacion());
        deliveryLabel2.setText(repartidor.toString());
    }

}