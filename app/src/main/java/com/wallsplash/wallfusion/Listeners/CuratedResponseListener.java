package com.wallsplash.wallfusion.Listeners;

import com.wallsplash.wallfusion.Models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
