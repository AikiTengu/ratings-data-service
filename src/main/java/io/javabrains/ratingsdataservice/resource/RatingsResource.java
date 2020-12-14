package io.javabrains.ratingsdataservice.resource;

import io.javabrains.ratingsdataservice.model.Rating;
import io.javabrains.ratingsdataservice.model.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRatingByMovieId(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 5);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRatingByUserId(@PathVariable("userId") String userId) {
        List<Rating> ratings =  Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

}
