package unstablebrainiac.com.iitbevents;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by unstablebrainiac on 10/2/18.
 */

public interface RetrofitInterface {
    @GET("/events/getEvents")
    Call<List<Event>> fetchEvents();
}
