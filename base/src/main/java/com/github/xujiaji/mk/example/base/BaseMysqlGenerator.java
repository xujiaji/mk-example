package com.github.xujiaji.mk.example.base;

import com.github.xujiaji.mk.common.MysqlGenerator;

/**
 * @author jiajixu
 * @date 2020/10/23 15:47
 */
public class BaseMysqlGenerator extends MysqlGenerator {
    @Override
    protected String tablePrefix() {
//        return "sec_";
        return "";
    }

    @Override
    protected String moduleName() {
        return "file";
    }


    public static void main(String[] args) {
        new BaseMysqlGenerator().runs(
                "mk_file"
        );
    }
}
