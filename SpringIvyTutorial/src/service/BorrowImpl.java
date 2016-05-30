package src.service;

import src.model.Comic;

public class BorrowImpl implements Borrow{
	
	
	public Object getComic() throws Exception{
		
		Comic comic = new Comic();
		comic.setTitle("One Piece");
		return comic;
	}

	@Override
	public Object borrowComic() {
		return null;
	}

}
