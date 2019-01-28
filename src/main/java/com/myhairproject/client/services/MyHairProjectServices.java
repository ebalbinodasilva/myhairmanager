package com.myhairproject.client.services;

import com.myhairproject.client.dao.MyHairProjectDao;

public interface MyHairProjectServices {
	MyHairProjectDao getById(Integer id);
	MyHairProjectDao save(MyHairProjectDao myhairprojectdao);

}
