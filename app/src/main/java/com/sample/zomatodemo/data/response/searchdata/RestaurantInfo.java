package com.sample.zomatodemo.data.response.searchdata;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

import com.sample.zomatodemo.BR;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestaurantInfo extends BaseObservable implements Parcelable {
    @SerializedName("R")
    @Expose
    private RestaurantId r;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("switch_to_order_menu")
    @Expose
    private Integer switchToOrderMenu;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = null;
    @SerializedName("opentable_support")
    @Expose
    private Integer opentableSupport;
    @SerializedName("is_zomato_book_res")
    @Expose
    private Integer isZomatoBookRes;
    @SerializedName("mezzo_provider")
    @Expose
    private String mezzoProvider;
    @SerializedName("is_book_form_web_view")
    @Expose
    private Integer isBookFormWebView;
    @SerializedName("book_form_web_view_url")
    @Expose
    private String bookFormWebViewUrl;
    @SerializedName("book_again_url")
    @Expose
    private String bookAgainUrl;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("include_bogo_offers")
    @Expose
    private Boolean includeBogoOffers;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("order_url")
    @Expose
    private String orderUrl;
    @SerializedName("order_deeplink")
    @Expose
    private String orderDeeplink;
    @SerializedName("is_table_reservation_supported")
    @Expose
    private Integer isTableReservationSupported;
    @SerializedName("has_table_booking")
    @Expose
    private Integer hasTableBooking;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("establishment_types")
    @Expose
    private List<Object> establishmentTypes = null;
    private String cityName;

    public RestaurantInfo(){

    }

    protected RestaurantInfo(Parcel in) {
        apikey = in.readString();
        id = in.readString();
        name = in.readString();
        url = in.readString();
        location = in.readParcelable(Location.class.getClassLoader());
        if (in.readByte() == 0) {
            switchToOrderMenu = null;
        } else {
            switchToOrderMenu = in.readInt();
        }
        cuisines = in.readString();
        if (in.readByte() == 0) {
            averageCostForTwo = null;
        } else {
            averageCostForTwo = in.readInt();
        }
        if (in.readByte() == 0) {
            priceRange = null;
        } else {
            priceRange = in.readInt();
        }
        currency = in.readString();
        if (in.readByte() == 0) {
            opentableSupport = null;
        } else {
            opentableSupport = in.readInt();
        }
        if (in.readByte() == 0) {
            isZomatoBookRes = null;
        } else {
            isZomatoBookRes = in.readInt();
        }
        mezzoProvider = in.readString();
        if (in.readByte() == 0) {
            isBookFormWebView = null;
        } else {
            isBookFormWebView = in.readInt();
        }
        bookFormWebViewUrl = in.readString();
        bookAgainUrl = in.readString();
        thumb = in.readString();
        photosUrl = in.readString();
        menuUrl = in.readString();
        featuredImage = in.readString();
        if (in.readByte() == 0) {
            hasOnlineDelivery = null;
        } else {
            hasOnlineDelivery = in.readInt();
        }
        if (in.readByte() == 0) {
            isDeliveringNow = null;
        } else {
            isDeliveringNow = in.readInt();
        }
        byte tmpIncludeBogoOffers = in.readByte();
        includeBogoOffers = tmpIncludeBogoOffers == 0 ? null : tmpIncludeBogoOffers == 1;
        deeplink = in.readString();
        orderUrl = in.readString();
        orderDeeplink = in.readString();
        if (in.readByte() == 0) {
            isTableReservationSupported = null;
        } else {
            isTableReservationSupported = in.readInt();
        }
        if (in.readByte() == 0) {
            hasTableBooking = null;
        } else {
            hasTableBooking = in.readInt();
        }
        eventsUrl = in.readString();
        cityName = in.readString();
    }

    public static final Creator<RestaurantInfo> CREATOR = new Creator<RestaurantInfo>() {
        @Override
        public RestaurantInfo createFromParcel(Parcel in) {
            return new RestaurantInfo(in);
        }

        @Override
        public RestaurantInfo[] newArray(int size) {
            return new RestaurantInfo[size];
        }
    };

    @Bindable
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
        notifyPropertyChanged(BR.cityName);
    }

    public RestaurantId getR() {
        return r;
    }

    public void setR(RestaurantId r) {
        this.r = r;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Bindable
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    public Integer getSwitchToOrderMenu() {
        return switchToOrderMenu;
    }

    public void setSwitchToOrderMenu(Integer switchToOrderMenu) {
        this.switchToOrderMenu = switchToOrderMenu;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    public Integer getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public Integer getOpentableSupport() {
        return opentableSupport;
    }

    public void setOpentableSupport(Integer opentableSupport) {
        this.opentableSupport = opentableSupport;
    }

    public Integer getIsZomatoBookRes() {
        return isZomatoBookRes;
    }

    public void setIsZomatoBookRes(Integer isZomatoBookRes) {
        this.isZomatoBookRes = isZomatoBookRes;
    }

    public String getMezzoProvider() {
        return mezzoProvider;
    }

    public void setMezzoProvider(String mezzoProvider) {
        this.mezzoProvider = mezzoProvider;
    }

    public Integer getIsBookFormWebView() {
        return isBookFormWebView;
    }

    public void setIsBookFormWebView(Integer isBookFormWebView) {
        this.isBookFormWebView = isBookFormWebView;
    }

    public String getBookFormWebViewUrl() {
        return bookFormWebViewUrl;
    }

    public void setBookFormWebViewUrl(String bookFormWebViewUrl) {
        this.bookFormWebViewUrl = bookFormWebViewUrl;
    }

    public String getBookAgainUrl() {
        return bookAgainUrl;
    }

    public void setBookAgainUrl(String bookAgainUrl) {
        this.bookAgainUrl = bookAgainUrl;
    }

    @Bindable
    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
        notifyPropertyChanged(BR.thumb);
    }
    @Bindable
    public UserRating getUserRating() {
        return userRating;
    }

    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
        notifyPropertyChanged(BR.userRating);
    }

    public String getPhotosUrl() {
        return photosUrl;
    }

    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    public Boolean getIncludeBogoOffers() {
        return includeBogoOffers;
    }

    public void setIncludeBogoOffers(Boolean includeBogoOffers) {
        this.includeBogoOffers = includeBogoOffers;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getOrderDeeplink() {
        return orderDeeplink;
    }

    public void setOrderDeeplink(String orderDeeplink) {
        this.orderDeeplink = orderDeeplink;
    }

    public Integer getIsTableReservationSupported() {
        return isTableReservationSupported;
    }

    public void setIsTableReservationSupported(Integer isTableReservationSupported) {
        this.isTableReservationSupported = isTableReservationSupported;
    }

    public Integer getHasTableBooking() {
        return hasTableBooking;
    }

    public void setHasTableBooking(Integer hasTableBooking) {
        this.hasTableBooking = hasTableBooking;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public List<Object> getEstablishmentTypes() {
        return establishmentTypes;
    }

    public void setEstablishmentTypes(List<Object> establishmentTypes) {
        this.establishmentTypes = establishmentTypes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(apikey);
        parcel.writeString(id);
        parcel.writeString(name);
        parcel.writeString(url);
        parcel.writeParcelable(location, i);
        if (switchToOrderMenu == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(switchToOrderMenu);
        }
        parcel.writeString(cuisines);
        if (averageCostForTwo == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(averageCostForTwo);
        }
        if (priceRange == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(priceRange);
        }
        parcel.writeString(currency);
        if (opentableSupport == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(opentableSupport);
        }
        if (isZomatoBookRes == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(isZomatoBookRes);
        }
        parcel.writeString(mezzoProvider);
        if (isBookFormWebView == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(isBookFormWebView);
        }
        parcel.writeString(bookFormWebViewUrl);
        parcel.writeString(bookAgainUrl);
        parcel.writeString(thumb);
        parcel.writeString(photosUrl);
        parcel.writeString(menuUrl);
        parcel.writeString(featuredImage);
        if (hasOnlineDelivery == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(hasOnlineDelivery);
        }
        if (isDeliveringNow == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(isDeliveringNow);
        }
        parcel.writeByte((byte) (includeBogoOffers == null ? 0 : includeBogoOffers ? 1 : 2));
        parcel.writeString(deeplink);
        parcel.writeString(orderUrl);
        parcel.writeString(orderDeeplink);
        if (isTableReservationSupported == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(isTableReservationSupported);
        }
        if (hasTableBooking == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(hasTableBooking);
        }
        parcel.writeString(eventsUrl);
        parcel.writeString(cityName);
    }
}
