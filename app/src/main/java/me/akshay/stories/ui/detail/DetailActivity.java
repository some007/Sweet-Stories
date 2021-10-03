package me.akshay.stories.ui.detail;

import static me.akshay.stories.services.UtilService.setUrlToImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

import me.akshay.stories.R;
import me.akshay.stories.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding viewBinding;
    private DetailViewModel viewModel;
    private TextToSpeech tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new DetailViewModel();
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        viewBinding.setViewModel(viewModel);
        viewBinding.executePendingBindings();
        initViews();
        initTextToSpeech();
    }

    private void initViews() {
        viewBinding.ivBack.setOnClickListener((view -> onBackPressed()));
        setUrlToImageView(this, viewBinding.coverIv, DetailViewModel.getBookModel().getCover());
        viewBinding.titleTv.setText(DetailViewModel.getBookModel().getTitle());
        viewBinding.ratingTv.setText(String.valueOf(DetailViewModel.getBookModel().getRating()));
        viewBinding.rateBar.setRating((float) DetailViewModel.getBookModel().getRating());
        viewBinding.descriptionTv.setText(DetailViewModel.getBookModel().getStory());
        viewBinding.playBtn.setOnClickListener((view)-> {
            if( tts!=null && tts.isSpeaking()){
                tts.stop();
                viewBinding.playBtn.setText("Play Audio Book");
            }else{
                speak();
            }
        });
    }

    @Override
    protected void onDestroy() {
        if (tts!=null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    private void initTextToSpeech() {
        tts = new TextToSpeech(getApplicationContext(), status -> {
            if (status == TextToSpeech.SUCCESS) {
                int result = tts.setLanguage(Locale.US);
                if (result == TextToSpeech.LANG_MISSING_DATA
                        || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    viewBinding.playBtn.setText("Unavailable");
                } else {
                    viewBinding.playBtn.setText("Play Audio Book");
                }
            } else {
                viewBinding.playBtn.setText("Unavailable");
            }
        });
        tts.setPitch(1.2f);
    }

    private void speak() {
        String text = DetailViewModel.getBookModel().getStory();
        tts.setPitch(1.02f);
        tts.setSpeechRate(1f);
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
    }

}