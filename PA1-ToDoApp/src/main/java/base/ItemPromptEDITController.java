package base;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ItemPromptEDITController {
    @FXML
    private Button itemPromptOkEDITBtn;

    @FXML
    private CheckBox isCompleteEDITBtn;

    @FXML
    private TextField itemDateTextBoxDEDIT;

    @FXML
    private TextField itemDateTextBoxMEDIT;

    @FXML
    private TextField itemDateTextBoxYEDIT;

    @FXML
    private TextField itemDetailsTextBoxEDIT;

    @FXML
    private TextField itemNameTextBoxEDIT;

    @FXML
    private void editItem(ToDoList listEntry, ToDoItem itemEntry){
        //On "ok" button press, retrieve strings from the fields and check boolean value
        String nameEntry;
        String dateEntry;
        String detailEntry;
        //Change values of itemEntry
        //If isComplete is selected update boolean value
        //Close window
    }
}
