package com.getcapacitor.myapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

import com.getcapacitor.BridgeFragment;

import java.util.ArrayList;
import java.util.List;

public class SimpleFragmentActivity extends AppCompatActivity implements BridgeFragment.OnFragmentInteractionListener {
  private TextView mTextMessage;
  private ViewPager mViewPager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment_simple);
  }



  @Override
  public void onFragmentInteraction(Uri uri) {
  }
}
