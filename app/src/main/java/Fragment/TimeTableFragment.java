package Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.examples.metropolitan.android.leagueoflegends.R;

/**
 * Created by Dariusch on 11.11.2016.
 */

public class TimeTableFragment extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.timetable_main,container,false);
            return rootView;

        }
    }
