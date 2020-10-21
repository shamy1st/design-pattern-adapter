package com.shamy1st.adapter;

import com.shamy1st.adapter.avaFilters.Caramel;

public class CaramelFilterAdapter2 extends Caramel implements Filter {

	@Override
	public void apply(Image image) {
		super.init();
		super.render(image);
	}
}
