package br.com.rodrigobriet.tmdbclient.core.resources.query;

public class ImageQuery extends QueryField {

	public static final ImageQuery LANGUAGE = new ImageQuery("language");
	public static final ImageQuery INCLUDE_IMAGE_LANGUAGE = new ImageQuery("include_image_language");
	
	protected ImageQuery(String name) {
		super(name);
	}

}
