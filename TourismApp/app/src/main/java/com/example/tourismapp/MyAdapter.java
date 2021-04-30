package com.example.tourismapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>
{
	private final ArrayList<TouristAttraction> attractions;
	private final MainActivity parent;
	private final boolean horizontal;

	MyAdapter(ArrayList<TouristAttraction> items, MainActivity parent, boolean horizontal)
	{
		this.attractions = new ArrayList<>();
		this.attractions.addAll(items);
		this.parent = parent;
		this.horizontal = horizontal;
	}

	@Override
	public void onBindViewHolder(MyViewHolder holder, final int position)
	{
		holder.setPicture(attractions.get(position).picture);
		holder.setCountry(attractions.get(position).country);
		holder.setName(attractions.get(position).name);
		holder.setInformation(attractions.get(position).information);

		holder.itemView.setOnClickListener(v -> parent.onAttraction(attractions.get(position)));
	}

	@Override
	public int getItemCount()
	{
		return attractions.size();
	}

	@NonNull
	@Override
	public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
	{
		if (horizontal)
		{
			return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal, parent, false));
		}
		else
		{
			return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical, parent, false));
		}
	}
}