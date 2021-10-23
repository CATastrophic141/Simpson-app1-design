/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

package base;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Objects;

public class Application extends javafx.application.Application {

    //Create treemap to store the list of to-do lists
    ArrayList<ToDoList> listList;
    boolean showCompleted;
    boolean showIncomplete;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Scene.fxml")));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("Styles.css")).toExternalForm());

        stage.setTitle("To-Do List Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    /*NOTES*/
    //SortingTree is a phony company, any likeness or use of name from existing company or organization is a coincidence
    //(In regard to the PNG image) Protected by fair use laws. Intended use is for educational purposes.
    //          Original image has been altered using image editing software
}

class mainWindowController {
    @FXML
    private MenuItem SaveMenuBtn;

    @FXML
    private void saveList(){
        //Open save window
    }

    @FXML
    private MenuItem UploadMenuBtn;

    @FXML
    private void uploadList(){
        //Open upload window
    }

    @FXML
    private Label dateText;

    @FXML
    private void setDateText(){
        //Set the label's text as the date of from the to-do item's information package
    }

    @FXML
    private Label detailText;

    @FXML
    private void setDetailText(){
        //Set the label's text as the date of from the to-do item's information package
    }

    @FXML
    private CheckBox hideCompletedBtn;

    @FXML
    private void setHideCompletedBtn(){
        //Set the showCompleted boolean to false
    }

    @FXML
    private CheckBox hideIncompleteBtn;

    @FXML
    private void setHideIncompleteBtnBtn(){
        //Set the showIncomplete boolean to false
    }

    @FXML
    private Label itemNameText;

    @FXML
    private void setItemNameText(){
        //Set the label's text to the name of the item
    }

    @FXML
    private Button listOfItemsAddBtn;

    @FXML
    private void useListOfItemsAddBtn(){
        //Open prompt window
    }

    //Display complete and incomplete based on boolean "show values"
    @FXML
    private ListView<?> listOfListsList;

    @FXML
    private void selectFromListOfItems(){
        //Get data from the selected item in list
    }

    @FXML
    private Button listOfItemsEditBtn;

    @FXML
    private void useListOfItemsEditBtn(){
        //Open prompt window
    }

    @FXML
    private Button listOfItemsRmvBtn;

    @FXML
    private void uselistOfItemsRmvBtn(){
        //Remove item from arraylist
    }

    @FXML
    private Button listOfListAddBtn;

    @FXML
    private void uselistOfListAddBtn(){
        //Open prompt window
    }

    @FXML
    private ListView<?> listOfItemsList;

    @FXML
    private void selectFromListOfList(){
        //Get data from the selected item in the list
    }

    @FXML
    private Button listOfListEditBtn;

    @FXML
    private void useListOfListEditBtn(){
        //Open prompt window
    }

    @FXML
    private Button listOfListRmvBtn;

    @FXML
    private void useListOfListRmvBtn(){
        //Remove array list
    }
}

class ListPrompt_ADD_Controller {
    @FXML
    private TextField listNameBox_ADD;

    @FXML
    private Button listNameOkBtn_ADD;

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

class ListPrompt_EDIT_Controller {
    @FXML
    private TextField listNameBox_EDIT;

    @FXML
    private Button listNameOkBtn_EDIT;

    @FXML
    private void editListName(ToDoList listEntry){
        //On "ok" button press, retrieve string from listNameBox
        String nameEntry;
        //Change value of entry name to retrieved string
        //Close window
    }
}

class ItemPrompt_ADD_Controller {
    @FXML
    private TextField itemDateTextBoxD_ADD;

    @FXML
    private TextField itemDateTextBoxM_ADD;

    @FXML
    private TextField itemDateTextBoxY_ADD;

    @FXML
    private TextField itemDetailsTextBox_ADD;

    @FXML
    private TextField itemNameTextBox_ADD;

    @FXML
    private void createItem(ToDoList listEntry){
        //On "ok" button press, retrieve strings from the fields and check boolean value
        String nameEntry = "";
        String dateEntry = "";
        String detailEntry = "";
        //Create new ToDoItem
        ToDoItem item = new ToDoItem(nameEntry, dateEntry, detailEntry);
        //Add item to arraylist of items in to do list
        //Close window
    }
}

class ItemPrompt_EDIT_Controller {
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

class SavePromptController {
    @FXML
    private ComboBox<?> saveList;

    @FXML
    private TextField savePath;

    @FXML
    private TextField fileNameText;

    @FXML
    private Button fileSaveOkBtn;

    @FXML
    private void saveList(){
        //On ok button press
        //Save string from file name text box
        String fileName;
        //Save string from file path text box
        String filePath;
        //Create file
        //Set output to file
        //Save number of lists
        //For every list
            //Save list name
            //Save number of items
            //For every item
                //Save item name
                //Save due date
                //Save details
                //Save completion status
        //Close window
    }
}

class UploadPromptController {
    @FXML
    private TextField uploadPath;

    @FXML
    private Button fileUploadOkBtn;

    @FXML
    private void uploadList(){
        //For the number of lists
            //Save list name
            //Create arraylist of arraylist entry
                //For the number of items
                //Save item assets
                //Create an arraylist entry
        //Close window
    }
}