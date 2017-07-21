package ro.kronsoft.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@RequestMapping(value = "/movie/find/id", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<Movie> findMovieById(@RequestParam(value = "id") Integer id) {
		Movie movie = movieRepository.findOne(id);
		return ResponseEntity.ok().body(movie);
	}
}
