package Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.examples.metropolitan.android.leagueoflegends.R;

/**
 * Created by Dariusch on 28.10.2016.
 */

public class InformationFragment extends Fragment {

    View myView;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        myView = inflater.inflate(R.layout.information_main, container, false);
        return myView;
    }

}
