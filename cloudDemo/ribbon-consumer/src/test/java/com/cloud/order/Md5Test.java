package com.cloud.order;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Test {

    public static String getMd5Values(){
        StringBuilder content = new StringBuilder();
        content.append("20190809004555");
        content.append("{\"id\":123}");
        content.append("df41726dbb10c410");//能力秘钥
        System.out.println(DigestUtils.md5Hex(content.toString()));
        return DigestUtils.md5Hex(content.toString());
    }

    public static void main(String args[]){
//        Md5Test.getMd5Values();
        String content = "20190809190355"+"{\"id\":123}"+"df41726dbb10c410";
        System.out.println(DigestUtils.md5Hex(content));
    }

}
