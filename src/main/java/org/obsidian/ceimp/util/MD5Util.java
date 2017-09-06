package org.obsidian.ceimp.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BillChen on 2017/8/18.
 */
public class MD5Util {
    private static final BASE64Encoder base64Encoder = new BASE64Encoder();

    private static final MD5Util instance = new MD5Util();

    private MD5Util(){}

    public static MD5Util getInstance(){
        return instance;
    }

    public String EncoderByMd5(String password) throws NoSuchAlgorithmException,UnsupportedEncodingException{
        return base64Encoder.encode(MessageDigest.getInstance("MD5").digest(password.getBytes("utf-8")));
    }
}