package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    //Planned tests for core functionalities of program

    //Test list of lists selection
    @Test
    void testArraylistOfArraylistRetrieval(){
        //Generate arraylist through similar means of gui
        //Test that arraylist fetching method retrieves arraylist element properly
    }

    //Test list of items selection
    @Test
    void testArraylistOfItemsRetrieval(){
        //Generate arraylist through similar means of gui
        //Test that arraylist fetching method retrieves arraylist item properly
                //and that the item can be properly accessed
    }

    @Test
    void testSetDateText(){
        //Set text to arbitrary value
        //Test if the label displays the given string
    }

    @Test
    void testSetDetailText(){
        //Set text to arbitrary value
        //Test if the label displays the given string
    }

    @Test
    void testSetItemNameText(){
        //Set text to arbitrary value
        //Test if the label displays the given string
    }

    @Test
    void testListOfItemsRmvBtn(){
        //Generate arraylist through similar means of gui
        //Test if item is properly removed/is still in arraylist
    }

    @Test
    void testListOfListRmvBtn(){
        //Generate arraylist through similar means of gui
        //Test if list is properly removed/is still in arraylist
    }

    //Test creation and editing of ToDoItem
    @Test
    void testItemModification(){
        //Generate ToDoItem through similar means of gui
        //Test if the values are equivalent to given values
    }

    //Test creation and editing of ToDoList
    @Test
    void testListModification(){
        //Generate ToDoList through similar means of gui
        //Test if the values (name) are equivalent to given values
    }

    @Test
    void testFileCreation(){
        //Generate file through similar means of gui
        //Test if the file exists at the specified path
    }
}