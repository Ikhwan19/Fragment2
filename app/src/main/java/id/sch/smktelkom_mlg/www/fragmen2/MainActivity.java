package id.sch.smktelkom_mlg.www.fragmen2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle; import
        android.view.View;
import id.sch.smktelkom_mlg.www.fragmen2.Fragment.MultipleFragment;
import id.sch.smktelkom_mlg.www.fragmen2.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void multiple (View view){
        Intent intent = new
                Intent(getApplicationContext(), MultipleFragment.class);
        startActivity(intent);
    }
}
