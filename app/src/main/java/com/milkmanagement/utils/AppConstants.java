package com.milkmanagement.utils;


public class AppConstants {


    public static String BASE_URL = "https://alkrainapp.cloverinfosoft.com/api/";

    public static String GET_ACCESS_TOKEN = BASE_URL + "oauth/token";
    public static String FLURRY_KEY = "5BYMPZFHN9H7GYXK2HWG";

    public static int ENTITY_ID = 2;

    public static String selected_city="";
    public static String selected_city_id="";
    public static String search_type="";

    public static int receiver_id=-1;
    public static String receiver_name="";
    public static String REGISTER = BASE_URL + "auth/user";
    public static String LOGIN = BASE_URL + "auth/login";
    public static String FORGOT_PASSWORD = BASE_URL + "auth/forgot";
    public static String CAR_LIST = BASE_URL + "car/car";
    public static String ADD_CAR=BASE_URL+"car/addcar";
    public static String UPDATE_CAR=BASE_URL+"car/updatecar";
    public static String UPLOAD_IMAGE=BASE_URL+"upload/image";
    public static String CAR_DETAILS=BASE_URL+"car/carById";

    public static String SPARE_PART_LIST=BASE_URL+"sparepart/spareparts";
    public static String SPARE_PART_DETAILS=BASE_URL+"sparepart/sparepartById";
    public static String UPDATE_SPARE_PART=BASE_URL+"sparepart/updatesparepart";
    public static String ADD_SPARE_PART=BASE_URL+"sparepart/addsparepart";

    public static String DEALER_LIST=BASE_URL+"dealer/dealers";
    public static String DEALER_DETAILS=BASE_URL+"dealer/dealerById";
    public static String ADD_DEALER=BASE_URL+"dealer/adddealer";
    public static String MODEL_BY_MAKE=BASE_URL+"auth/modelByMakeId";
    public static String SEND_OTP = BASE_URL + "send_otp";
    public static String VERIFY_OTP = BASE_URL + "auth/verifyotp";
    public static String RESEND_OTP = BASE_URL + "auth/resendotp";

    public static String COMMENT=BASE_URL+"message/comment";
    public static String COMMENT_LIST=BASE_URL+"message/list";
    public static String ADD_FAV=BASE_URL+"car/addfavourite";

    public static String PROFILE_UPDATE=BASE_URL+"auth/user";
    public static String FAVOURITE_LISTING=BASE_URL+"car/favourite";
    public static String DELETE_CAR=BASE_URL+"car/deletecar";
    public static String LOGOUT=BASE_URL+"auth/signout";

    public static String MY_CHAT_HISTORY=BASE_URL+"message/myhistory";
    public static String MESSAGE_LISTING=BASE_URL+"message/list";
    public static String SEND_MESSAGE=BASE_URL+"message/send";

    public static String ADD_ORDER=BASE_URL+"order/add";
    public static String LIST_ORDER=BASE_URL+"order/orders";
    public static String ORDER_BY_ID=BASE_URL+"order/orderById";
    public static String DELETE_ORDER=BASE_URL+"order/deleteOrder";
    public static String UPDATE_ORDER=BASE_URL+"order/updateOrder";


    public static String APP_LAUNCH=BASE_URL+"auth/launch";
    public static String APP_LAUNCH_ARABIC=BASE_URL+"auth/arlaunch";
    public static String SEARCH_DATA=BASE_URL+"search/getdata";
    public static String UPDATE_TOKEN=BASE_URL+"auth/refreshDeviceToken";

    public static String MESSAGE_COUNT=BASE_URL+"message/mychatcount";


}//app contants end
