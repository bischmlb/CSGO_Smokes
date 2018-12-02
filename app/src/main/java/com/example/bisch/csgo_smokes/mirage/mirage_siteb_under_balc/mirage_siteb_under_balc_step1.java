package com.example.bisch.csgo_smokes.mirage.mirage_siteb_under_balc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bisch.csgo_smokes.R;
import com.example.bisch.csgo_smokes.mirage.mirage_mid_cat.mirage_mid_cat_step2;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link mirage_siteb_under_balc_step1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link mirage_siteb_under_balc_step1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mirage_siteb_under_balc_step1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private mirage_siteb_under_balc_step1.OnFragmentInteractionListener mListener;

    public mirage_siteb_under_balc_step1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mirage_sitea_ct_step1.
     */
    // TODO: Rename and change types and number of parameters
    public static mirage_siteb_under_balc_step1 newInstance(String param1, String param2) {
        mirage_siteb_under_balc_step1 fragment = new mirage_siteb_under_balc_step1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mirage_siteb_under_balc_step1, container, false);
/*
        final Button btn_step2 = (Button) view.findViewById(R.id.btn_step2);

        btn_step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mirage_mid_cat_step2 step2= new mirage_mid_cat_step2();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainer, step2,"findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });
        */
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof mirage_siteb_under_balc_step1.OnFragmentInteractionListener) {
            mListener = (mirage_siteb_under_balc_step1.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
