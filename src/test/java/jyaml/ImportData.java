package jyaml;

import net.wincn.core.bean.AppConfig;
import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Author: gefangshuai
 * Create: 2014-03-28 22:26
 */
public class ImportData {
    public static void main(String[] args) throws FileNotFoundException {
        AppConfig config = Yaml.loadType(new File("test.yml"), AppConfig.class);
        System.out.println(config.getMenus());
    }
}
