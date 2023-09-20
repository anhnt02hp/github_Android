package vn.edu.usth.githubbrowser;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    Button btnRepositoriesProfile, btnStaredProfile, btnOrganizationsProfile;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        Button repositories_profile = view.findViewById(R.id.btn_repositories_profile);
        Button stared_profile = view.findViewById(R.id.btn_stared_profile);
        Button organizations_profile = view.findViewById(R.id.btn_organizations_profile);

        repositories_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnRepositoriesProfile = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnRepositoriesProfile);
            }
        });

        stared_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnStaredProfile = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnStaredProfile);
            }
        });

        organizations_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnOrganizationsProfile = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnOrganizationsProfile);
            }
        });

        return view;
    }
}
