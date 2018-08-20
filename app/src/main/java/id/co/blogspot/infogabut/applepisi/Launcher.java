package id.co.blogspot.infogabut.applepisi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_laucher);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                checkStats();
//            }
//        }, 2000);
//    }

//    private void checkStats(){
//        if(isLogin()){
//            Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
//            finish();
//            startActivity(mainIntent);
//        }else {
//            Intent loginIntent = new Intent(getApplicationContext(), Menuawal.class);
//            finish();
//            startActivity(loginIntent);
//        }
//    }
//
//    private boolean isLogin(){
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
//        return currentUser != null;
//    }
}


