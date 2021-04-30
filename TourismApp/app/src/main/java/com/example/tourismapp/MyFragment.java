package com.example.tourismapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MyFragment extends Fragment
{
	private final Drawable picture;
	private final String country;
	private final String name;
	private final String information;

	MyFragment(Drawable drawable, String country, String name, String information)
	{
		this.picture = drawable;
		this.country = country;
		this.name = name;
		this.information = information;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View fragment = inflater.inflate(R.layout.fragment, container, false);

		ImageView picture_image = fragment.findViewById(R.id.picture);
		picture_image.setImageDrawable(picture);

		TextView country_text = fragment.findViewById(R.id.country);
		if (country_text != null)
			country_text.setText(country);

		TextView name_text = fragment.findViewById(R.id.name);
		if (name_text != null)
			name_text.setText(name);

		TextView information_text = fragment.findViewById(R.id.information);
		if (information_text != null)
			information_text.setText(information);

		return fragment;
	}
}