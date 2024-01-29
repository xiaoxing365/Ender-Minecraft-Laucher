package org.eml.fox.util.json;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class JsonUtil {
    public String jsonToString(JSON json){
        String s = JSONObject.toJSONString(json);
        return s;
    }
    public JSONObject stringToJson(String s){
        JSONObject json = JSONObject.parseObject(s);
        return json;
    }
}
