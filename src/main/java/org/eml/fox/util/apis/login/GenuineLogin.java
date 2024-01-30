package org.eml.fox.util.apis.login;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSONObject;
import org.eml.fox.util.encoder.Base64Util;
import org.eml.fox.util.json.JsonUtil;

public class GenuineLogin {
    private JsonUtil jsonUtil =new JsonUtil();
    public JSONObject getPlayerUUID(String playerName){
        String playerProfile = "https://api.mojang.com/users/profiles/minecraft/"+playerName;
        String httpResult = HttpUtil.get(playerProfile);
        JSONObject json =  jsonUtil.stringToJson(httpResult);
        return json;
    }

    /**
     * 不使用Base64解码Value
     * @param playerUUID
     * @return
     */
    public JSONObject getPlayerprofile(String playerUUID){
        String profile = "https://sessionserver.mojang.com/session/minecraft/profile/"+playerUUID;
        String httpResult = HttpUtil.get(profile);
        JSONObject json = jsonUtil.stringToJson(httpResult);
        return json;
    }

    /**
     * 直接使用Base64解码Value
     * @param playerUUID
     * @return
     */
    public JSONObject getPlayerprofileWV(String playerUUID){
        String profile = "https://sessionserver.mojang.com/session/minecraft/profile/"+playerUUID;
        String httpResult = HttpUtil.get(profile);
        JSONObject json = jsonUtil.stringToJson(httpResult);
        String value = "value";
        String valueString = httpResult.toString();
        String decodeString = Base64Util.decode(valueString);
        String value_v = json.getString(value);
        json.replace(value_v,decodeString);
        return json;
    }
}
