package br.com.ricas;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class MoviesClient {

    @GET
    @Path("https://sa-east-1.aws.data.mongodb-api.com/app/application-0-qobua/endpoint/movies")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMoviesData(@HeaderParam("Authorization") String apiKey) {
        // TODO
        return null;
    }
}
