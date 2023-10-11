package br.com.ricas.application.web;

import br.com.ricas.application.response.MoviesResponse;
import br.com.ricas.domain.service.MoviesService;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/movies")
public class MoviesResource {
    @RestClient
    MoviesService moviesService;
    @Inject
    @ConfigProperty(name = "mongodb.http.apikey")
    String apiKey;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MoviesResponse> getMovies() {
        return moviesService.getMovies(apiKey);
    }
}
