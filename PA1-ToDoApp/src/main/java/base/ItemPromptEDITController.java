package base;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class ItemPromptEDITController {
    @FXML
    private CheckBox IsCompleteBtn;

    @FXML
    private TextField itemDateTextBoxD_EDIT;

    @FXML
    private TextField itemDateTextBoxM_EDIT;

    @FXML
    private TextField itemDateTextBoxY_EDIT;

    @FXML
    private TextField itemDetailsTextBox_EDIT;

    @FXML
    private TextField itemNameTextBox_EDIT;

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
