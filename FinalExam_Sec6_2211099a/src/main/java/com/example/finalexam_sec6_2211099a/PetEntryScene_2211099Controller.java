package com.example.finalexam_sec6_2211099a;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class PetEntryScene_2211099Controller
{
    @javafx.fxml.FXML
    private TextField petID;
    @javafx.fxml.FXML
    private ComboBox<String> species;
    @javafx.fxml.FXML
    private CheckBox adoptionStatusCheckbox;
    @javafx.fxml.FXML
    private TextField name;
    @javafx.fxml.FXML
    private DatePicker dateOfBirth;

    @javafx.fxml.FXML
    public void initialize() {
        species.getItems().addAll("Dog","Cat","Rabbit");
    }

    @javafx.fxml.FXML
    public void addPetButtonOnAction(ActionEvent actionEvent) {

        String adoptionStatus= "Yes";
        if (adoptionStatusCheckbox.isSelected()) {
            adoptionStatus = "true";
        }else (adoptionStatusCheckbox.isSelected()) {
            adoptionStatus = "False";

        Pet_2211099 info = new Pet_2211099(
                Integer.parseInt(petID).getText(),
                name.getText(),
                species.getValue(),
                adoptionStatus,
                dateOfBirth.getValue()
        );

        File file = new File("pet.bin");
        try{
            FileInputStream fis= new FileInputStream(file);
            ObjectInputStream ois= new ObjectInputStream(fis);

            while(true){
                try{
                    Pet_2211099 p= (Pet_2211099)ois.readObject();
                    dataShowTable.getItems(p);

                }catch(EOFException e){
                    break;
                }
            }
        }catch(IOException| ClassNotFoundException e ){

        }



        }


    }

    @javafx.fxml.FXML
    public void petLoadSceneButtonChangeOnAction(ActionEvent actionEvent) {
        Parent root= FXMLLoader.load(getClass().getResource(PetLoadScene_2211099.fxml));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}