package practicum.getfitla_v3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ExerciseDetailActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.individual_exercise_detail);
        Bundle data = getIntent().getExtras();
        ExerciseItemFormat CurItem = (ExerciseItemFormat) data.getParcelable("ExerciseInfo");

        TextView title = (TextView) findViewById(R.id.exercise_title);
        title.setText(CurItem.getName());
        TextView guide = (TextView) findViewById(R.id.exercise_guide);
        guide.setText(CurItem.getInstructions());

    }

}
