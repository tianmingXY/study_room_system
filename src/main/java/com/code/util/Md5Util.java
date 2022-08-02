package com.code.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 加密工具类  不需要可以删除
 */
public class Md5Util {
    public static String md5(String buffer) {
        String string = null;
        char hexDigist[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(buffer.getBytes());
            byte[] datas = md.digest(); //16个字节的长整数

            char[] str = new char[2 * 16];
            int k = 0;

            for (int i = 0; i < 16; i++) {
                byte b = datas[i];
                str[k++] = hexDigist[b >>> 4 & 0xf];//高4位
                str[k++] = hexDigist[b & 0xf];//低4位
            }
            string = new String(str);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return string;
    }

    public static void main(String[] args) {
        String md5Str = Md5Util.md5("123456");
        System.out.println("md5Str = " + md5Str);
    }
}
