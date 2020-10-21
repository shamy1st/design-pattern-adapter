package com.shamy1st.adapter;

import com.shamy1st.adapter.avaFilters.Caramel;

public class CaramelFilterAdapter1 implements Filter {

	private Caramel caramel = new Caramel();
	
	public CaramelFilterAdapter1(Caramel caramel) {
		this.caramel = caramel;
	}
	
	@Override
	public void apply(Image image) {
		caramel.init();
		caramel.render(image);
	}
}
