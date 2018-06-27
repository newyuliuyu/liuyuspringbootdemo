package com.liuyu.commons.json;

import com.alibaba.fastjson.serializer.SerializeConfig;

import java.util.Map;

/**
 * ClassName: FastJsonSerializeConfig <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 17-12-12 下午4:09 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class FastJsonSerializeConfig {
    public static void setSerializeConfig(SerializeConfig config, Map<String, Object> typeMap) {
        try {
            for (String type : typeMap.keySet()) {
                Class myType = getType(type);
                config.put(myType, typeMap.get(type));
            }
        } catch (Exception e) {
            throw new RuntimeException("创建对象失败", e);
        }
    }

    private static Class getType(String type) {
        if (type.equals("byte")) {
            return byte.class;
        } else if (type.equals("short")) {
            return short.class;
        } else if (type.equals("int")) {
            return int.class;
        } else if (type.equals("long")) {
            return long.class;
        } else if (type.equals("float")) {
            return float.class;
        } else if (type.equals("double")) {
            return double.class;
        } else if (type.equals("boolean")) {
            return boolean.class;
        } else if (type.equals("char")) {
            return char.class;
        } else if (type.equals("Object[]")) {
            return Object[].class;
        } else if (type.equals("byte")) {
            return byte[].class;
        } else if (type.equals("short")) {
            return short[].class;
        } else if (type.equals("int")) {
            return int[].class;
        } else if (type.equals("long")) {
            return long[].class;
        } else if (type.equals("float")) {
            return float[].class;
        } else if (type.equals("double")) {
            return double[].class;
        } else if (type.equals("boolean")) {
            return boolean[].class;
        } else if (type.equals("char")) {
            return char[].class;
        } else {
            try {
                return Class.forName(type);
            } catch (Exception e) {
                throw new RuntimeException("创建对象失败", e);
            }
        }
    }
}
