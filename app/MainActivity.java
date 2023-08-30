package com.photoview2.app8848;
 
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;



import com.github.chrisbanes.photoview.PhotoView;


public class MainActivity extends Activity { 
     private int N1=1;
	 
	//private ImageView photoview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		final PhotoView photoview2 = findViewById(R.id.photo_view);
        photoview2.setImageResource(R.drawable.kk1);
		Button button22=findViewById(R.id.Button12);
		button22.setOnClickListener(new View.OnClickListener() {
			    private String yu;
				@Override
				public void onClick(View v) {
					// 换下一张照片的逻辑
					N1=(N1+1)%18;
					yu="kk"+N1;
					int resourceId = getResources().getIdentifier(yu, "drawable", getPackageName());

					photoview2.setImageResource(resourceId);
					}
			});
        
    }
	
} 
