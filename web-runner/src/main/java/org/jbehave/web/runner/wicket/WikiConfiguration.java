package org.jbehave.web.runner.wicket;

public class WikiConfiguration implements WikiConfigurer {

	private String uri;
	
	public WikiConfiguration(String uri) {
		this.uri = uri;
	}

	public String getURI() {
		return uri;
	}
	
}