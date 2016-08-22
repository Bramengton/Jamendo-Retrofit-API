package com.tonyostudio.jammily.api;

import android.support.annotation.NonNull;

import com.tonyostudio.jammily.BuildConfig;
import com.tonyostudio.jammily.Model.TAlbum;
import com.tonyostudio.jammily.Model.TArtist;
import com.tonyostudio.jammily.Model.TPlaylist;
import com.tonyostudio.jammily.Model.TRadio;
import com.tonyostudio.jammily.Model.TReview;
import com.tonyostudio.jammily.Model.TTrack;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by tonyofrancis on 8/19/16.
 */

public interface JamendoService {

    String BASE_URL = "https://api.jamendo.com/";
    String CLIENT_ID = BuildConfig.JAMENDO_CLIENT_ID;
    int CACHE_SIZE = 10 * 1024 * 1024;

    @GET("v3.0/albums")
    Observable<TAlbum> albums(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/albums/tracks")
    Observable<TAlbum> albumsTracks(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/albums/musicinfo")
    Observable<TAlbum> albumsMusicInfo(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/artists")
    Observable<TArtist> artists(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/artists/tracks")
    Observable<TArtist> artistsTrack(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/artists/albums")
    Observable<TArtist> artistsAlbums(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/artists/locations")
    Observable<TArtist> locations(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/artists/musicinfo")
    Observable<TArtist> artistsMusicInfo(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/playlists")
    Observable<TPlaylist> playlists(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/playlists/tracks")
    Observable<TPlaylist> playlistsTracks(@Query("id") int id, @NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/radios")
    Observable<TRadio> radios(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/radios/stream")
    Observable<TRadio> stream(@Query("id") int id, @Query("name") String name, @NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/tracks")
    Observable<TTrack> tracks(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/tracks/similar")
    Observable<TTrack> similar(@Query("id") int id, @NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/reviews/albums")
    Observable<TReview> reviewsAlbums(@NonNull @QueryMap Map<String,String> options);

    @GET("v3.0/reviews/tracks")
    Observable<TReview> reviewsTracks(@NonNull @QueryMap Map<String,String> options);
}
