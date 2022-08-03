package gui.application.democombobox;

import gui.entities.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private ComboBox<Person> personComboBox;

    @FXML
    private Button buttonAll;

    @FXML
    private void onButtonAllAction() {
        for (Person person : personComboBox.getItems()) {
            System.out.println(person);
        }
    }

    @FXML
    private void onComboBoxPersonAction() {
        Person person = personComboBox.getSelectionModel().getSelectedItem();
        System.out.println(person);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Maria Ester", "mariaester@gmail.com"));
        personList.add(new Person(2, "Neide Santana", "neidefferreira@hotmail.com"));
        personList.add(new Person(3, "Calos Alberto", "albertocarlos@yahoo.com"));
        personList.add(new Person(4, "Edina Silva", "ednasilva@gmail.com.br"));
        personList.add(new Person(5, "Eduardo Bolsonaro", "deputadoeduardo@gmail.com"));

        ObservableList<Person> personObservableList = FXCollections.observableArrayList(personList);
        personComboBox.setItems(personObservableList);

        Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<>() {

            @Override
            protected void updateItem(Person item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        personComboBox.setCellFactory(factory);
        personComboBox.setButtonCell(factory.call(null));
    }
}
