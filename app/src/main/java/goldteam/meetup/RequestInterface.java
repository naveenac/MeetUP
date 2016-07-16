package goldteam.meetup;

/**
 * Created by c on 7/14/2016.
 */

import goldteam.meetup.ServerResponse;
import goldteam.meetup.ServerRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("index.php")
    Call<ServerResponse> operation(@Body ServerRequest request);

}