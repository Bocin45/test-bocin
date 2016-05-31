package src.service;

import org.springframework.beans.factory.annotation.Autowired;

import src.model.Customer;
import src.model.CustomerDAO;

public class ManageComicImpl implements ManageComic{

	@Autowired
	CustomerDAO customerDAO;
	@Override
	public Object save() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update() {
		// TODO Auto-generated method stub
		return null;
	}

}
