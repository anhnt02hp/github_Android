package vn.edu.usth.githubbrowser.fragment.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import vn.edu.usth.githubbrowser.api.repos.ApiActivity;
import vn.edu.usth.githubbrowser.fragment.subs.OrganizationsFragment;
import vn.edu.usth.githubbrowser.fragment.subs.ProjectFragment;
import vn.edu.usth.githubbrowser.fragment.subs.PullRequestsFragment;
import vn.edu.usth.githubbrowser.R;
import vn.edu.usth.githubbrowser.fragment.subs.SearchFragment;
import vn.edu.usth.githubbrowser.fragment.subs.StaredFragment;

public class HomeFragment extends Fragment {

    Button btnIssues, btnPullRequests, btnDiscussion, btnProject, btnRepositories, btnOrganizations, btnStared, btnSearch;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        Button issues = view.findViewById(R.id.btn_issues);
        Button pullRequests = view.findViewById(R.id.btn_pull_requests);
        Button discussion = view.findViewById(R.id.btn_discussion);
        Button project = view.findViewById(R.id.btn_projects);
        Button repositories = view.findViewById(R.id.btn_repositories);
        Button organizations = view.findViewById(R.id.btn_organizations);
        Button stared = view.findViewById(R.id.btn_stared);

        Button search = view.findViewById(R.id.btn_search);

        issues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnIssues = new Intent(getActivity(), IssueFragment.class);
                startActivity(btnIssues);
            }
        });

        pullRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnPullRequests = new Intent(getActivity(), PullRequestsFragment.class);
                startActivity(btnPullRequests);
            }
        });

        discussion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnDiscussion = new Intent(getActivity(), DiscussionFragment.class);
                startActivity(btnDiscussion);
            }
        });

        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnProject = new Intent(getActivity(), ProjectFragment.class);
                startActivity(btnProject);
            }
        });

        repositories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnRepositories = new Intent(getContext(), ApiActivity.class);
                startActivity(btnRepositories);
            }
        });

        organizations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnOrganizations = new Intent(getActivity(), OrganizationsFragment.class);
                startActivity(btnOrganizations);
            }
        });

        stared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnStared = new Intent(getActivity(), StaredFragment.class);
                startActivity(btnStared);
            }
        });


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnSearch = new Intent(getActivity(), SearchFragment.class);
                startActivity(btnSearch);
            }
        });


        return view;
    }
}
