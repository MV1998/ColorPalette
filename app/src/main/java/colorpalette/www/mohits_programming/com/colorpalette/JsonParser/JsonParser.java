package colorpalette.www.mohits_programming.com.colorpalette.JsonParser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import colorpalette.www.mohits_programming.com.colorpalette.Model.ColorsValues;

public class JsonParser {


    public static ColorsValues getColorInformation(String JSONDATA)
    {
        ColorsValues colorsValues =  new ColorsValues ();


        try {

            colorsValues.setColor_name (getString ("value",getSubJsonObject ("name",getRootJsonObject (JSONDATA))));

            colorsValues.setImage_URL (getString ("bare",getSubJsonObject ("image",getRootJsonObject (JSONDATA))));

            colorsValues.setHex_value_color (getString ("value",getSubJsonObject ("hex",getRootJsonObject (JSONDATA))));

            colorsValues.setR_g_b_color_value (getString ("value",getSubJsonObject ("rgb",getRootJsonObject (JSONDATA))));

            colorsValues.setH_s_v_color_value (getString ("value",getSubJsonObject ("hsv",getRootJsonObject (JSONDATA))));

            colorsValues.setH_s_l_color_value (getString ("value",getSubJsonObject ("hsl",getRootJsonObject (JSONDATA))));
        }catch (Exception e){
            e.printStackTrace ();
        }

        return colorsValues;
    }

    public static JSONArray getNames(String data)throws JSONException{
        JSONObject jsonObject = new JSONObject (data);
        JSONArray jsonArray = jsonObject.names ();
        return jsonArray;
    }

    public static String getString(String string,String data) throws JSONException{
        JSONObject jsonObject = new JSONObject (data);
       String hexValue= jsonObject.getString (string);
        return  hexValue;
    }

    public static JSONObject getRootJsonObject(String HttpClientData)throws JSONException{

        JSONObject jsonObject = new JSONObject (HttpClientData);
        return jsonObject;
    }
    public static JSONObject getSubJsonObject(String tagName, JSONObject jsonObject)throws JSONException
    {
        JSONObject jsonObject1 = jsonObject.getJSONObject (tagName);
        return jsonObject1;
    }

    public static String getString(String tagName, JSONObject jsonObject) throws JSONException{

        String value = jsonObject.getString (tagName);
        return value;
    }


}
