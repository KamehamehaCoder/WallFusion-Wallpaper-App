package com.wallsplash.wallfusion.Listeners;

import com.wallsplash.wallfusion.Models.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response, String message);
    void onError(String message);
}
