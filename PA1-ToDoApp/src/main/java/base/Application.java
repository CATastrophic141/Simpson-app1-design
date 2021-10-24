/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Rylan Simpson
 */

package base;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Objects;

public class Application extends javafx.application.Application {

    //Arraylist of to do lists
            //Each list item contains an arraylist of to do items
    ArrayList<ToDoList> listList;
    //ToDoItem variable for storage
    ToDoItem listItem;
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