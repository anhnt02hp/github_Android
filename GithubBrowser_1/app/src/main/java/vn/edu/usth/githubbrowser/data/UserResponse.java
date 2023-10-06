package vn.edu.usth.githubbrowser.data;

import java.util.ArrayList;

public class UserResponse {
    private ArrayList<User> items;

    public UserResponse(ArrayList<User> items) {
        this.items = items;
    }

    public ArrayList<User> getItems() {
        return items;
    }

    public void setItems(ArrayList<User> items) {
        this.items = items;
    }
}
