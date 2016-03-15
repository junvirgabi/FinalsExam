package sidespell.tech.finalsexam.api;

import android.net.Uri;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONObject;

import sidespell.tech.finalsexam.utils.HttpUtils;

public class GenderApi {

    public static final String BASE_URL = "https://api.genderize.io/";

    private static final String G_GENDER = "gender";
    private static final String G_NAME = "name";

    public static String getGender(String name) {
        Uri uri = Uri.parse(BASE_URL).buildUpon()
                .appendQueryParameter("name", name)
                .build();

        String jsonStr = HttpUtils.GET(uri);

        String gender;

        JSONArray jsonArray;

        JSONObject jsonObject;

        if (!TextUtils.isEmpty(jsonStr)) {
            try {
                // TODO: Implement JSON Parsing here..
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
