package br.com.rodrigobriet.tmdbclient.core.resources.queries;

public class ImageQuery extends AbstractQueryField {

	public static final ImageQuery LANGUAGE = new ImageQuery("language");
	public static final ImageQuery INCLUDE_IMAGE_LANGUAGE = new ImageQuery("include_image_language");
	
	protected ImageQuery(String name) {
		super(name);
	}

}
