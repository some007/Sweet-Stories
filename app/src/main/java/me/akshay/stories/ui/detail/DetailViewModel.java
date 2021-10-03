package me.akshay.stories.ui.detail;

import androidx.databinding.BaseObservable;

import me.akshay.stories.common.model.BookModel;

public class DetailViewModel extends BaseObservable {
    public static BookModel bookModel;
    DetailViewModel(){}

    public static BookModel getBookModel() {
        return bookModel;
    }
}
