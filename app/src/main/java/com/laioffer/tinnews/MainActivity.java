package com.laioffer.tinnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                            .findFragmentById(R.id.nav_host_fragment);
        navController = navHostFragment.getNavController();
        // click on tab on  BottomNavView can navigate
        NavigationUI.setupWithNavController(navView, navController);
        // can display label on action bar
        NavigationUI.setupActionBarWithNavController(this, navController);

//        NewsApi api = RetrofitClient.newInstance().create(NewsApi.class);
//        // Call<NewsResponse>
//        api.getTopHeadlines("us").enqueue(new Callback<NewsResponse>() {
//            @Override
//            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
//                if (response.isSuccessful()) {
//                    Log.d("getTopHeadlines", response.body().toString());
//                } else {
//                    Log.d("getTopHeadlines", response.toString());
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<NewsResponse> call, Throwable t) {
//                // 比如断网了，根本没有reach到service
//                Log.d("getTopHeadlines", t.toString());
//            }
//        });
    }

   @Override
   public boolean onSupportNavigateUp() {
        // can click back
      return navController.navigateUp();
   }
}

