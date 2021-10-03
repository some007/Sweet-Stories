package me.akshay.stories.ui.main;

import static me.akshay.stories.services.UtilService.setUrlToImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.Tab;

import me.akshay.stories.R;
import me.akshay.stories.common.OnItemClickListener;
import me.akshay.stories.common.model.BookModel;
import me.akshay.stories.databinding.ActivityMainBinding;
import me.akshay.stories.services.SharedPrefService;
import me.akshay.stories.ui.detail.DetailActivity;
import me.akshay.stories.ui.detail.DetailViewModel;

public class MainActivity extends AppCompatActivity implements OnItemClickListener<BookModel> {

    private ActivityMainBinding viewBinding;
    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new MainViewModel(this);
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewBinding.setViewModel(viewModel);
        viewBinding.executePendingBindings();
        initTabs();
        initRecyclerView();
        updateUserDetails();
    }

    private void updateUserDetails() {
        viewBinding.userName.setText(viewModel.getAccount().getUserName());
        setUrlToImageView(this, viewBinding.userDp, viewModel.getUrl());
    }

    private void initRecyclerView() {
        MainBookAdpter forBottom = new MainBookAdpter(viewModel.getBooks(false)
                .getValue(),this);
        forBottom.setModelListener(this);
        viewBinding.bottomList.setLayoutManager(new GridLayoutManager(this, 3));
        viewBinding.bottomList.setHasFixedSize(true);
        viewBinding.bottomList.setAdapter(forBottom);
        topRecycler();
    }

    private void topRecycler() {
        BookAdpter forTop = new BookAdpter(viewModel.getBooks(true)
                .getValue(),this);
        forTop.setModelListener(this);
        viewBinding.topList.setLayoutManager(new LinearLayoutManager(this
                , LinearLayoutManager.HORIZONTAL, false));
        viewBinding.topList.setAdapter(forTop);
    }

    private void initTabs() {
        Tab forYouTab = viewBinding.tabs.newTab();
        forYouTab.setText("For You");
        forYouTab.setId(0);
        Tab popularTab = viewBinding.tabs.newTab();
        popularTab.setText("Popular");
        popularTab.setId(1);
        Tab latestTab = viewBinding.tabs.newTab();
        latestTab.setText("Latest");
        latestTab.setId(2);
        viewBinding.tabs.addTab(forYouTab);
        viewBinding.tabs.addTab(popularTab);
        viewBinding.tabs.addTab(latestTab);
        viewBinding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                topRecycler();
            }

            @Override
            public void onTabUnselected(Tab tab) {

            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });
    }

    @Override
    public void onClicked(View view, BookModel bookModel){
        Intent intent = new Intent(this, DetailActivity.class);
        DetailViewModel.bookModel = bookModel;
        ActivityOptions options = ActivityOptions
                .makeSceneTransitionAnimation(this, view, getString(R.string.cover_transition));
        startActivity(intent, options.toBundle());
    }
}
