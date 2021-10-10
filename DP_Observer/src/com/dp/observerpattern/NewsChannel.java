package com.dp.observerpattern;

public class NewsChannel implements Channel {
	private String news;

	@Override
	public void update(Object feed) {
		this.setNews((String)feed);
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

}
