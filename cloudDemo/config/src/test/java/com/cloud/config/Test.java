package com.cloud.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;

public class Test {

    @org.junit.Test
    public void testEncrypt() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");          // 加密的算法，这个算法是默认的
        config.setPassword("gb");                        // 加密的密钥
        standardPBEStringEncryptor.setConfig(config);
        //加密用户信息
        String plainText = "TwilightGB";
        String encryptedText = standardPBEStringEncryptor.encrypt(plainText);
        //加密密码信息
        String Enpassword = "";
        String EnpasswordText = standardPBEStringEncryptor.encrypt(Enpassword);
        //加密地址信息
        String DBAUrl = "数据库地址信息";
        String DBAUrlText = standardPBEStringEncryptor.encrypt(DBAUrl);
        System.out.println("用户"+encryptedText);
        System.out.println("密码"+EnpasswordText);
        System.out.println("地址"+DBAUrlText);
    }

    @org.junit.Test
    public void testDe() throws Exception {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();

        config.setAlgorithm("PBEWithMD5AndDES");
        config.setPassword("gb");
        standardPBEStringEncryptor.setConfig(config);
        String encryptedText = "jQP16AVgmh990wPJeeoYmw==";
        String plainText = standardPBEStringEncryptor.decrypt(encryptedText);
        System.out.println(plainText);
    }
}
