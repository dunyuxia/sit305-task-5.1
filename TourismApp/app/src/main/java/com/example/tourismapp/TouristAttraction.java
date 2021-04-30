package com.example.tourismapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

public class TouristAttraction
{
	public final Drawable picture;
	public final String country;
	public final String name;
	public final String information;

	TouristAttraction(Context context, int picture_id, String country, String name, String information)
	{
		this.picture = ContextCompat.getDrawable(context, picture_id);
		this.country = country;
		this.name = name;
		this.information = information;
	}
}