package com.example.tourismapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
	private FragmentManager mManager;
	private MyFragment mFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//	Initialize data items
		ArrayList<TouristAttraction> horizontalAttractions = new ArrayList<>();
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.great_wall, "China", "Great Wall", "In a land of modern cities and towering skyscrapers, the Great Wall of China, built between the 14th and 17th centuries, is a stark contrast but a striking image that all visitors to China should see."));
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.eiffel, "France", "Eiffel Tower", "The symbol of Paris and one of the most photographed structures in the world, a visit to the Eiffel Tower is a must for all travelers. Few landmarks inspire such a passion for travel as this single iron structure."));
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.colosseum, "Italy", "The Colosseum", "The most famous and largest structure still standing from the Roman Empire, the Colosseum is also the biggest attraction of modern-day Rome. It's been a bucket-list destination of travelers for generations. And it does not disappoint."));
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.liberty, "USA", "Statue of Liberty", "America is full of great sights and places to visit, but it's the Statue of Liberty that represents the United States like no other place. This symbol of freedom in New York City was gifted by the French to the American people in 1896."));
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.machu_picchu, "Peru", "Machu Picchu", "If you are planning to see only one attraction in South America, this is the place to come. The ancient Inca city of Machu Picchu is arguably the most impressive ruined city in the world."));
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.acropolis, "Greek", "The Acropolis", "Perched above present day Athens, the Acropolis draws you up and in. Follow in the footsteps of ancients as you walk up the same steps that have been walked on since 438 BC - 2,500 years."));
		horizontalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.taj, "India", "The Taj Mahal", "The Taj Mahal is the one sight in India that all travelers need to see. The country is filled with incredible cities and fabulous places to visit, but the 17th-century Taj Mahal is the one place that says you've been to India."));

		ArrayList<TouristAttraction> verticalAttractions = new ArrayList<>();
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.forbidden_city, "China", "Forbidden City", "Like the Great Wall, the Forbidden City in Beijing is one of the top places to visit in China. The sprawling complex dates from the 14th and 15th centuries and is a spectacular example of historical China."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.pyramid, "Egypt", "Pyramids of Giza", "If you've visited places like the Colosseum in Rome or the Acropolis in Athens, built over 2,000 years ago, you may think you have a good handle on ancient sites. But the Pyramids of Giza take ancient to a whole other level. These were built over 4,500 years ago. Tourists were coming to see these magnificent structures literally thousands of years ago."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.angkor, "Cambodia", "Angkor Wat", "Surrounded by jungle and, in some cases, overgrown with huge trees and roots, the ancient structures of the Angkor complex may look like a movie set to some visitors."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.petra, "Jordan", "Petra", "You may have an Indiana Jones feeling as you walk through a 1.2-kilometer-long narrow crack in the sandstone hills and emerge into a hidden city. First built over 2,000 years ago and lost to the outside world for 600 years, the city was only discovered in 1812."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.canyon, "USA", "Grand Canyon", "The greatest natural attraction in the United States, the Grand Canyon is a key sight for all travelers planning their lifetime of adventures. Standing on the rim of the Grand Canyon, looking out over the carved landscape, will awaken your senses."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.stonehenge, "England", "Stonehenge", "Stonehenge is one of those places that makes you ponder what went on here over 4,500 years ago. It's long been a mystery to historians, and has captured the imagination of countless visitors. Despite the large number of tourists that descend on Stonehenge, the place still has a mystical feel."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.borobudur, "Indonesia", "Borobudur", "Set in a steamy jungle with three volcanoes providing the backdrop, Borobudur is Indonesia's top tourist attraction. Borobudur dates from the 9th century and is one of the largest Buddhist temples in the world. It's a fascinating place to wander about. Over 500 Buddhas are spread around the site, some of which sit under ornate stupas."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.opera_house, "Australia", "Sydney Opera House", "Like many other attractions around the world, the Sydney Opera House is one of those places that is easy to identify and obviously associated with Australia. A photo of yourself in front of the white sails screams Australia."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.kilimanjaro, "Tanzania", "Mount Kilimanjaro", "The highest peak in all of Africa, this majestic mountain - a dormant volcano - is one of the most recognizable symbols of the continent. The snowcapped peak is often the backdrop to photographs of the wild animals that roam Amboseli National Park and other areas."));
		verticalAttractions.add(new TouristAttraction(getBaseContext(), R.drawable.louvre, "France", "The Louvre", "If there is one museum in the whole world that you absolutely must see in your life, it's the Louvre. Even if you are not a fan of museums, this one is worth the trip to Paris to see."));


		//	Initialize the two recycler views
		RecyclerView hRecyclerView = findViewById(R.id.recycler0);
		LinearLayoutManager hLayoutManager = new LinearLayoutManager(this);
		hLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
		hRecyclerView.setLayoutManager(hLayoutManager);
		hRecyclerView.setAdapter(new MyAdapter(horizontalAttractions, this, true));
		hRecyclerView.setItemAnimator(new DefaultItemAnimator());

		RecyclerView vRecyclerView = findViewById(R.id.recycler1);
		LinearLayoutManager vLayoutManager = new LinearLayoutManager(this);
		vLayoutManager.setOrientation(RecyclerView.VERTICAL);
		vRecyclerView.setLayoutManager(vLayoutManager);
		vRecyclerView.setAdapter(new MyAdapter(verticalAttractions, this, false));
		vRecyclerView.setItemAnimator(new DefaultItemAnimator());

		mManager = getSupportFragmentManager();
	}

	public void onAttraction(TouristAttraction item)
	{
		mFragment = new MyFragment(item.picture, item.country, item.name, item.information);
		mManager.beginTransaction().replace(R.id.fragment, mFragment).commit();
		mManager.beginTransaction().show(mFragment);
	}

	@Override
	public void onBackPressed()
	{
		mManager.beginTransaction().hide(mFragment).commit();
	}
}