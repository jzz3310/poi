package com.jzz.util;

import java.io.InputStream;

/**
 * @author:jzz
 * @date:2020/10/10
 */
public class PoiUtil {


    //TODO  导入和导出execl文件到数据库中
    public static boolean importFile(InputStream input, Class clazz, String fileSuffix) {

        return true;
    }

    public static boolean exporFile() {
        return true;
    }

    private static String verifySuffix(String suffix) throws Exception {
        if (suffix == null || "".equals(suffix)) {
            throw new Exception("文件后缀为空");
        }
        suffix = "." + suffix.substring(suffix.lastIndexOf(".")+1);
        return suffix;
    }

}
