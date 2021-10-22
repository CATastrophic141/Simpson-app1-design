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
import java.util.TreeMap;


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
        //Set the label's text as the name of from the to-do item's information package
    }

    @FXML
    private Button listOfItemsAddBtn;

    @FXML
    private void useListOfItemsAddBtn(){
        //Open prompt window
    }

    @FXML
    private ComboBox<?> listOfItemsDropdown;

    @FXML
    private void selectFromListOfItemsDropdown(){
        //Get data from the selected item in the dropdown menu
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
    private ComboBox<?> listOfListDropdown;

    @FXML
    private void selectFromListOfListDropdown(){
        //Get data from the selected item in the dropdown menu
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

    @FXML
    private TextField ListNameBox;

    @FXML
    private Button ListNameOkBtn;

    @FXML
    private void createList(){
        //On "ok" button press, retrieve string from listNameBox
        String nameEntry;
        //Create new ToDoList
        ToDoList list = new ToDoList();
        //Set list name
        //Add list to arraylist of lists
        //Close window
    }

    @FXML
    private void editListName(ToDoList listEntry){
        //On "ok" button press, retrieve string from listNameBox
        String nameEntry;
        //Change value of entry name to retrieved string
        //Close window
    }

    @FXML
    private TextField itemDateTextBox;

    @FXML
    private TextField itemDetailsTextBox;

    @FXML
    private CheckBox itemIsCompleteBox;

    @FXML
    private TextField itemNameTextBox;

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

    @FXML
    private void editItem(ToDoList listEntry, ToDoItem itemEntry){
        //On "ok" button press, retrieve strings from the fields and check boolean value
        String nameEntry;
        String dateEntry;
        String detailEntry;
        //Change values of itemEntry
        //Close window
    }
}