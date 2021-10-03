package me.akshay.stories.ui.main;

import static me.akshay.stories.services.UtilService.setUrlToImageView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.akshay.stories.R;
import me.akshay.stories.common.OnItemClickListener;
import me.akshay.stories.common.model.BookModel;

public class BookAdpter extends RecyclerView.Adapter<BookAdpter.BookHolder> {
    private List<BookModel> books;
    private Context context;
    private OnItemClickListener<BookModel> modelListener;

    public BookAdpter(List<BookModel> books, Context context) {
        this.books = books;
        this.context = context;
    }

    public void setModelListener(OnItemClickListener<BookModel> modelListener) {
        this.modelListener = modelListener;
    }

    public BookAdpter() {}

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View bookView = LayoutInflater.from(context)
                .inflate(R.layout.item_main_slide, parent, false);
        return new BookHolder(bookView);
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, int position) {
        BookModel book = books.get(position);
        holder.rating.setText(String.valueOf(book.getRating()));
        holder.title.setText(book.getTitle());
        setUrlToImageView(context, holder.cover, book.getCover());
        holder.itemView.setOnClickListener(view -> modelListener.onClicked(
                holder.cover, book));
    }

    protected static class BookHolder extends RecyclerView.ViewHolder {
        private final ImageView cover;
        private final TextView title, rating;

        public BookHolder (View itemView){
            super(itemView);
            cover = itemView.findViewById(R.id.cover_iv);
            title = itemView.findViewById(R.id.title_tv);
            rating = itemView.findViewById(R.id.rating_tv);
        }

    }

}
