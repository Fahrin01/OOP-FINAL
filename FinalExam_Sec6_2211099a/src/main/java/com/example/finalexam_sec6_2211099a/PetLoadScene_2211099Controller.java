package com.example.finalexam_sec6_2211099a;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class PetLoadScene_2211099Controller
{
    @javafx.fxml.FXML
    private TableColumn<Pet_2211099, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Pet_2211099, String>speciesTableColumn;
    @javafx.fxml.FXML
    private TableView <Pet_2211099>dataShowTable;
    @javafx.fxml.FXML
    private TableColumn<Pet_2211099, LocalDate> dateOfBirthTableColumn;
    @javafx.fxml.FXML
    private CheckBox selectedAdoptionStatus;
    @javafx.fxml.FXML
    private ComboBox <String>selectedSpecies;
    @javafx.fxml.FXML
    private TableColumn<Pet_2211099, Integer> petIDTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        speciesTableColumn.setCellValueFactory(new PropertyValueFactory<>("species"));
        petIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("petId"));
        dateOfBirthTableColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfBirth"));

        selectedSpecies.getItems().addAll("Dog","Cat","Rabbit");
    }

    @javafx.fxml.FXML
    public void loadDataFromFileButtonOnAction(ActionEvent actionEvent) {
        File file = new File("pet.bin");
        try{
            boolean exist= file.exists();
            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos = exist? new AppendableObjectOutputStream(fos) : new ObjectOutputStream(fos);

            for Pet_2211099 p = dataShowTable.getItems(){
                writeObject(p);

            }
            oos.close;
            fos.close();

        }catch (IOException){

        }

    info.add(p);
    dataShowTable.getItems().close;
    dataShowTable.getItems.addAll(info)
    }
}