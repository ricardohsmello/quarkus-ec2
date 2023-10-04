package br.com.ricas.application.web;

import br.com.ricas.domain.service.MoviesService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movies")
public class MoviesResource {

    @RestClient
    MoviesService moviesService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovies() {

        return moviesService.getMovies().getTitle();
    }
}
