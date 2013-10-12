package com.doca.historia;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;
import com.tjeannin.apprate.AppRate;
//import android.util.Log;
//import com.example.cosasmenu.R;

public class MainActivity extends Activity {
	
 //   private static final String TAG = "Main Activity";

     private Tracker tracker;

    
	//private oneFacts mOneFacts = new oneFacts();
	//private oneFacts2 mOneFacts = new oneFacts2();
	private historias mOneFacts = new historias();
	
	
	//este suppress es de warning de 29 text view already used 
    @SuppressLint("CutPasteId") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       // AdView ad = (AdView) findViewById(R.id.adView);
       // ad.loadAd(new AdRequest());
        
        //font
        TextView txt = (TextView) findViewById(R.id.textView1);  
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");  
       // txt.setTypeface(font);  
        txt.setTypeface(font);        
      
        //declaramos las View Variables ... y asignamos a las view
        final TextView answerLabel = (TextView) findViewById(R.id.textView1);
        Button getAnswerButton = (Button) findViewById(R.id.button1);
        
        getAnswerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String answer = mOneFacts.getAnswers();
	 			
				// respuesta con respuesta dinamica
				answerLabel.setText(answer);
			// answerLabel.animate();
				
				//EasyTracker.getInstance().setContext(this);
				EasyTracker.getInstance().setContext(getApplicationContext());
				tracker = EasyTracker.getTracker();
				//tracker.trackEvent(category, action, label, value);
				//EasyTracker.getTracker().trackEvent("", "", "", "");				
				EasyTracker.getTracker().sendEvent("", "", "button1", 0L);
								
			}
		});
       
        new AppRate(this)
        .setShowIfAppHasCrashed(false)
        .setMinDaysUntilPrompt(0)
        .setMinLaunchesUntilPrompt(3)        
        .init();             
    }
    //los 2 sig son analytics
    @Override
    protected void onStart() {
       super.onStart();
       EasyTracker.getInstance().activityStart(this); // Add this method
    }
  
    @Override
    protected void onStop() {
       super.onStop();
       EasyTracker.getInstance().activityStop(this); // Add this method
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
    // Handle presses on the action bar items
    switch (item.getItemId()) {
    
      //  case R.id.action_settings:
        //	Log.i(TAG, "click en settings");
          //  return true;
        	//Log.i(TAG, "click en settings");
         //   openSearch();

        case R.id.action_about:
        //	Log.i(TAG, "click en ABOUT");
        //    composeMessage();
            return true;
            
        case R.id.action_tweetfact:
        	String tweetUrl = "http://twitter.com/intent/tweet?url=&text=%23MiMomentoAmor+...+";
            //	Log.i(TAG, "click en twitter");
        	//String tweetUrl = "https://twitter.com/intent/tweet?text=PUT FACT HERE &url="
              //      + "https://www.google.com&hashtags=IWannaSeeMyFacts1DApp";
        	Uri uri = Uri.parse(tweetUrl);
        	startActivity(new Intent(Intent.ACTION_VIEW, uri));
        	
        //    composeMessage();
            return true;
                       
        default:
            return super.onOptionsItemSelected(item);
    }
} 
    
    
    //lo de resume y eso , 2 methods
   @Override
   public void onResume() {
   	super.onResume();
   }
   @Override
   public void onPause() {
   	super.onPause();
   }
    
}
