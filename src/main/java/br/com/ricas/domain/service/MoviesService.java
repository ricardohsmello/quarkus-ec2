package br.com.ricas.domain.service;

import br.com.ricas.application.response.MoviesResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "movies")
public interface MoviesService {
    @GET
    @Path("/app/application-0-qobua/endpoint/movies")
    @Produces(MediaType.APPLICATION_JSON)
    MoviesResponse getMovies();
}