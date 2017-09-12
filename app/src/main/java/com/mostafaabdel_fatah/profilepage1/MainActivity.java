package com.mostafaabdel_fatah.profilepage1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView faceImage,accountImage,photoImage,favoritImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /***************************************************************/
        favoritImage = (ImageView) findViewById(R.id.favoriteImage);
        favoritImage.setTag(R.drawable.ic_favorite_border_black_24dp);
        accountImage = (ImageView) findViewById(R.id.accountImage);
        photoImage   = (ImageView) findViewById(R.id.photoImage);
        faceImage    = (ImageView) findViewById(R.id.faceImage);
        faceImage.setTag(R.drawable.ic_insert_emoticon_black_24dp);
        /***************************************************************/
    }

    public void favoritebtnClicked(View view) {
        int id =(int)favoritImage.getTag();
        if (id == R.drawable.ic_favorite_black_24dp) {
            favoritImage.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);
            favoritImage.setTag(R.drawable.ic_favorite_border_black_24dp);
        }else {
            favoritImage.setBackgroundResource(R.drawable.ic_favorite_black_24dp);
            favoritImage.setTag(R.drawable.ic_favorite_black_24dp);
        }
    }
    public void accountbtnClicked(View view) {
        Toast.makeText(this,"Account Image Clicked",Toast.LENGTH_SHORT).show();
    }
    public void photobtnClicked(View view) {
        Toast.makeText(this,"Photo Image Clicked",Toast.LENGTH_SHORT).show();
    }
    public void facebtnClicked(View view) {
        int id =(int)faceImage.getTag();
        if (id == R.drawable.ic_sentiment_dissatisfied_black_24dp) {
            faceImage.setBackgroundResource(R.drawable.ic_insert_emoticon_black_24dp);
            faceImage.setTag(R.drawable.ic_insert_emoticon_black_24dp);
        }else {
            faceImage.setBackgroundResource(R.drawable.ic_sentiment_dissatisfied_black_24dp);
            faceImage.setTag(R.drawable.ic_sentiment_dissatisfied_black_24dp);
        }
    }
}
