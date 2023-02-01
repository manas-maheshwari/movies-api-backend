package codelogs.manas.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
// database access methods

    // now to initialize this, we either write a constructor or use this AUtoWired annotation
    @Autowired // this will let the framework know that we want it to instantiate this class for us.
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    //here the Optional method allows you to inform the framework that this method may or may not return a null-value.
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
