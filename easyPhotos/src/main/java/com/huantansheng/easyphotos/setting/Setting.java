package com.huantansheng.easyphotos.setting;

import android.view.View;

import com.huantansheng.easyphotos.models.album.entity.PhotoItem;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * EasyPhotos的设置值
 * Created by huan on 2017/10/24.
 */

public class Setting {
    public static int minWidth = 1;
    public static int minHeight = 1;
    public static int count = 1;
    public static WeakReference<View> photosAdView = null;
    public static WeakReference<View> albumItemsAdView = null;
    public static boolean photoAdIsOk = false;
    public static boolean albumItemsAdIsOk = false;
    public static ArrayList<PhotoItem> selectedPhotos = new ArrayList<>();


    public static void clear() {
        minWidth = 1;
        minHeight = 1;
        count = 1;
        photosAdView = null;
        albumItemsAdView = null;
        photoAdIsOk = false;
        albumItemsAdIsOk = false;
        selectedPhotos.clear();
    }

    public static boolean hasPhotosAd() {
        return photosAdView != null && photosAdView.get() != null;
    }

    public static boolean hasAlbumItemsAd() {
        return albumItemsAdView != null && albumItemsAdView.get() != null;
    }
}
