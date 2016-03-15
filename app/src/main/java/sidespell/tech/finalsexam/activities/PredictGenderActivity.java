package sidespell.tech.finalsexam.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sidespell.tech.finalsexam.R;
import sidespell.tech.finalsexam.fragments.PredictGenderFragment;

public class PredictGenderActivity extends AppCompatActivity {

    private PredictGenderFragment mPredictGenderFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict_gender);


        mPredictGenderFragment = PredictGenderFragment.newInstance();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, mPredictGenderFragment)
                .commit();

        // TODO: Attach and show the PredictGender Fragment on this activity
    }
}
