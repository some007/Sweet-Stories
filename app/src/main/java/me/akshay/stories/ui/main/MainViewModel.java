package me.akshay.stories.ui.main;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Collections;
import java.util.List;

import me.akshay.stories.common.model.BookModel;
import me.akshay.stories.common.model.UserModel;
import me.akshay.stories.services.SharedPrefService;

public class MainViewModel extends ViewModel {

    private UserModel account;
    private MutableLiveData<List<BookModel>> books;
    private String url;

    public LiveData<List<BookModel>> getBooks(boolean shuffle) {
        if (books == null) {
            books = new MutableLiveData<>();
            loadBooks();
        }
        if (books.getValue()!=null && shuffle)
            Collections.shuffle(books.getValue());
        return books;
    }

    public MainViewModel(Context context) {
        account = SharedPrefService.getUserLog(context);
        url = account.getProfile_picture();
        Log.d("MainViewModel", "Profile URL :"+getUrl());
    }

    public String getUrl() {
        return url;
    }

    public UserModel getAccount() {
        return account;
    }

    private void loadBooks() {
        books.setValue(new BooksRepo().LoadBooks());
    }

}
