package edu.eetac.ea.Messages_api;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public final class CommetnsApplication {
	
	public class CommentsApplication extends ResourceConfig {
		public CommentsApplication() {
			super();
			register(DeclarativeLinkingFeature.class);
		}

	}
}
