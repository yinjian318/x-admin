package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by YINJIAN on 2017/10/27.
 */
public class ParameterUtil {
    private  static Properties paramProps  = null ;

    static {
        paramProps = new Properties() ;
        InputStream is = null ;
        try {
            is = ParameterUtil.class.getResourceAsStream("/conf/config.properties") ;
            paramProps.load(is) ;
        } catch (IOException e) {
        }
        finally {
            try {
                if (is!=null) {
                    is.close() ;
                    is = null ;
                }
            } catch (Exception e) {
            }
        }
    }

    public static String getPropertyByName(String oropertyName) {
        try {
            String utf8 = new String(paramProps.getProperty(oropertyName).getBytes( "ISO-8859-1"),"UTF-8");
            return utf8;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static  String getOumiDomain() {
        return paramProps.getProperty("oumidomain") ;
    }

    public static  String getEndpoint_internal() {
        return paramProps.getProperty("endpoint_internal") ;
    }
}
