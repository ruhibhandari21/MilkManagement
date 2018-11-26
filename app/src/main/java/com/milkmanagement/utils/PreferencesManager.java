package com.milkmanagement.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class PreferencesManager {

    public static final String SHARED_PREFERENCES_NAME = "MVPJobConnectPref";

    /**
     * Instance
     */
    private static PreferencesManager preferencesManager = null;

    /**
     * Shared Preferences
     */
    private static SharedPreferences sharedPreferences;

    /**
     * Preferences variables
     */

    private String isLoggedIn = "isLoggedIn";
    private String token = "token";
    private String loginResp = "loginResp";
    private String onboardResp = "onboardResp";
    private String isOtpVerified = "isOtpVerified";
    private String isOnBoardDetailsFilled = "isOnBoardDetailsFilled";
    private String profileResp = "profileResp";
    private String RefineResp = "RefineResp";
    private String appLaunchResp = "appLaunchResp";
    private String profile = "profile";
    private String imgSelectionOption="imgSelectionOption";
    private String phone="phone";
    private String presentMsgCount="presentMsgCount";
    private String pastMsgCount="pastMsgCount";
    private String refineResp="refineResp";
    private String map_search_address="map_search_address";
    private String map_search_km="map_search_km";
    private String map_click="map_click";
    private String apply_filter="false";
    private String pinned_values="pinned_values";
    private String fcm_token="fcm_token";
    private String country_code="country_code";
    private String email="email";
    private String password="password";
    private String overlay1="overlay1";
    private String overlay2="overlay2";
    private String overlay3="overlay3";
    private String overlay4="overlay4";
    private String message="message";
    private String lat="lat";
    private String lng="lng";
    private String isPinned="isPinned";
    private String app_lauch="app_lauch";
    private String app_lauch_arabic="app_lauch_arabic";
    private String language="language";


    public String getlanguage() {
        return sharedPreferences.getString(language, "English");
    }

    public void setlanguage(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(language, text);
        editor.apply();
    }


    public String getapp_lauch_arabic() {
        return sharedPreferences.getString(app_lauch_arabic, "");
    }

    public void setapp_lauch_arabic(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(app_lauch_arabic, text);
        editor.apply();
    }

    public String getapp_lauch() {
        return sharedPreferences.getString(app_lauch, "");
    }

    public void setapp_lauch(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(app_lauch, text);
        editor.apply();
    }


    public boolean isPinned() {
        return sharedPreferences.getBoolean(isPinned, false);
    }

    public void setisPinned(boolean text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(isPinned, text);
        editor.apply();
    }




    public String getlat() {
        return sharedPreferences.getString(lat, "");
    }

    public void setlat(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(lat, text);
        editor.apply();

    }


    public String getlng() {
        return sharedPreferences.getString(lng, "");
    }

    public void setlng(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(lng, text);
        editor.apply();

    }




    public String getmessage() {
        return sharedPreferences.getString(message, "");
    }

    public void setmessage(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(message, text);
        editor.apply();

    }

    public String getOverlay1() {
        return sharedPreferences.getString(overlay1, "false");
    }

    public void setOverlay1(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(overlay1, text);
        editor.apply();

    }



    public String getOverlay2() {
        return sharedPreferences.getString(overlay2, "false");
    }

    public void setOverlay2(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(overlay2, text);
        editor.apply();

    }

    public String getOverlay3() {
        return sharedPreferences.getString(overlay3, "false");
    }

    public void setOverlay3(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(overlay3, text);
        editor.apply();

    }

    public String getOverlay4() {
        return sharedPreferences.getString(overlay4, "false");
    }

    public void setOverlay4(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(overlay4, text);
        editor.apply();

    }




    public String getpassword() {
        return sharedPreferences.getString(password, "");
    }

    public void setpassword(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(password, text);
        editor.apply();

    }


    public String getemail() {
        return sharedPreferences.getString(email, "");
    }

    public void setemail(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(email, text);
        editor.apply();

    }



    public String getcountry_code() {
        return sharedPreferences.getString(country_code, "");
    }

    public void setcountry_code(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(country_code, text);
        editor.apply();

    }


    public String getfcm_token() {
        return sharedPreferences.getString(fcm_token, "");
    }

    public void setfcm_token(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(fcm_token, text);
        editor.apply();

    }


    public String getpinned_values() {
        return sharedPreferences.getString(pinned_values, "");
    }

    public void setpinned_values(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(pinned_values, text);
        editor.apply();

    }

    public String getapply_filter() {
        return sharedPreferences.getString(apply_filter, "");
    }

    public void setapply_filter(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(apply_filter, text);
        editor.apply();

    }


    public String getmap_click() {
        return sharedPreferences.getString(map_click, "");
    }

    public void setmap_click(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(map_click, text);
        editor.apply();

    }

    public String getmap_search_km() {
        return sharedPreferences.getString(map_search_km, "");
    }

    public void setmap_search_km(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(map_search_km, text);
        editor.apply();

    }



    public String getmap_search_address() {
        return sharedPreferences.getString(map_search_address, "");
    }

    public void setmap_search_address(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(map_search_address, text);
        editor.apply();

    }





    private PreferencesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(
                SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public static PreferencesManager getInstance(Context context) {

        if (preferencesManager == null) {
            Log.v("Preference status", "new object of " + context);
            preferencesManager = new PreferencesManager(context);
        } else {
            Log.v("Preference status", "old object of " + context);
        }

        return preferencesManager;
    }


    public String getrefineResp() {
        return sharedPreferences.getString(refineResp, "");
    }

    public void setrefineResp(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(refineResp, text);
        editor.apply();

    }



    public String getimgSelectionOption() {
        return sharedPreferences.getString(imgSelectionOption, "");
    }

    public void setimgSelectionOption(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(imgSelectionOption, text);
        editor.apply();

    }


    public String getpastMsgCount() {
        return sharedPreferences.getString(pastMsgCount, "");
    }

    public void setpastMsgCount(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(pastMsgCount, text);
        editor.apply();

    }



    public String getpresentMsgCount() {
        return sharedPreferences.getString(presentMsgCount, "");
    }

    public void setpresentMsgCount(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(presentMsgCount, text);
        editor.apply();

    }



    public String getphone() {
        return sharedPreferences.getString(phone, "");
    }

    public void setphone(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(phone, text);
        editor.apply();

    }


    public String getprofile() {
        return sharedPreferences.getString(profile, "");
    }

    public void setprofile(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(profile, text);
        editor.apply();

    }


    public String getappLaunchResp() {
        return sharedPreferences.getString(appLaunchResp, "");
    }

    public void setappLaunchResp(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(appLaunchResp, text);
        editor.apply();

    }


    public String getRefineResp() {
        return sharedPreferences.getString(RefineResp, "");
    }

    public void setRefineResp(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(RefineResp, text);
        editor.apply();

    }



    public String getprofileResp() {
        return sharedPreferences.getString(profileResp, "");
    }

    public void setprofileResp(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(profileResp, text);
        editor.apply();

    }


    public String getisOnBoardDetailsFilled() {
        return sharedPreferences.getString(isOnBoardDetailsFilled, "false");
    }

    public void setisOnBoardDetailsFilled(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(isOnBoardDetailsFilled, text);
        editor.apply();

    }

    public String getisOtpVerified() {
        return sharedPreferences.getString(isOtpVerified, "false");
    }

    public void setisOtpVerified(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(isOtpVerified, text);
        editor.apply();

    }



    public String getLoginResp() {
        return sharedPreferences.getString(loginResp, "");
    }

    public void setLoginResp(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(loginResp, text);
        editor.apply();

    }


    public String getOnboardResp() {
        return sharedPreferences.getString(onboardResp, "");
    }

    public void setOnboardResp(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(onboardResp, text);
        editor.apply();

    }


    public String getisLoggedIn() {
        return sharedPreferences.getString(isLoggedIn, "false");
    }

    public void setisLoggedIn(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(isLoggedIn, text);
        editor.apply();

    }


    public String getToken() {
        return sharedPreferences.getString(token, "");
    }

    public void setToken(String text) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(token, text);
        editor.apply();

    }


    public void clearPreferences() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("ACCESS_TOKEN", "");
        editor.putString("ACCESS_TOKEN_SECRET", "");
        editor.clear();
        editor.apply();
    }


}
