package com.example.tourismapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class MyViewHolder extends RecyclerView.ViewHolder
{
	private final ImageView picture;
	private final TextView country;
	private final TextView name;
	private final TextView information;

	MyViewHolder(View v)
	{
		super(v);
		picture = v.findViewById(R.id.picture);
		country = v.findViewById(R.id.country);
		name = v.findViewById(R.id.name);
		information = v.findViewById(R.id.information);
	}

	void setPicture(Drawable picture)
	{
		this.picture.setImageDrawable(picture);
	}

	void setCountry(String country)
	{
		if (this.country != null)
		{
			this.country.setText(country);
		}
	}

	void setName(String name)
	{
		if (this.name != null)
		{
			this.name.setText(name);
		}
	}

	void setInformation(String information)
	{
		if (this.information != null)
		{
			this.information.setText(information);
		}
	}
}