package com.example.raghav.multilibrariesproject.mvp;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.raghav.multilibrariesproject.MyApplication;
import com.example.raghav.multilibrariesproject.R;
import com.example.raghav.multilibrariesproject.models.Citizen;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by raghav on 9/26/16.
 */

public class EmployeeDetailFragment extends Fragment implements IEmployeeView
{
    @BindView(R.id.userid)
    TextView userid;

    @BindView(R.id.username)
    TextView username;

    @BindView(R.id.email)
    TextView email;

    @Inject
    IEmployeePresenter iEmployeePresenter;

    private Unbinder unbinder;
    private ProgressDialog ringProgressDialog;

    public EmployeeDetailFragment() {

    }

    public static EmployeeDetailFragment getInstance() {
        return new EmployeeDetailFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ((MyApplication) getActivity().getApplication()).getComponent().inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.employee_detail_layout, container, false);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        iEmployeePresenter.setEmployeeView(this);
    }


    @Override
    public void setData(List<Citizen> citizens)
    {
        userid.setText(String.valueOf(citizens.get(0).getId()));
        username.setText(citizens.get(0).getName());
        email.setText(citizens.get(0).getEmail());
    }

    @Override
    public void showLoader()
    {
        ringProgressDialog = ProgressDialog.show(getContext(), "Please wait ...", "Downloading Data ...", true);
        ringProgressDialog.setCancelable(false);
    }

    @Override
    public void hideLoader()
    {
        ringProgressDialog.hide();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
