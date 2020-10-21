package com.shamy1st;

import com.shamy1st.adapter.CaramelFilterAdapter2;
import com.shamy1st.adapter.CaramelFilterAdapter1;
import com.shamy1st.adapter.Image;
import com.shamy1st.adapter.ImageView;
import com.shamy1st.adapter.avaFilters.Caramel;

public class Main {

	public static void main(String[] args) {
		
		ImageView imageView = new ImageView(new Image());
		
		//composition is better than inheritance because if you have filter abstract class you can't have multiple-inheritance.
		
		imageView.apply(new CaramelFilterAdapter1(new Caramel())); //using composition
		//or
		imageView.apply(new CaramelFilterAdapter2()); //using inheritance
	}
}