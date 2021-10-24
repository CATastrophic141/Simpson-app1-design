package base;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ListPromptADDController {
    @FXML
    private TextField listNameADDBox;

    @FXML
    private Button listNameOkADDBtn;

    @FXML
    private void createList(){
        //On "ok" button press, retrieve string from listNameBox
        String nameEntry;
        //If string is less than 3 characters append "list" onto string
        //Create new ToDoList
        ToDoList list = new ToDoList();
        //Set list name
        //Add list to arraylist of lists
        //Close window
    }
}
