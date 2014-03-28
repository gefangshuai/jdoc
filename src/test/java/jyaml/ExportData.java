package jyaml;

import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试导出yaml文件
 * Author: gefangshuai
 * Create: 2014-03-28 22:00
 */
public class ExportData {
    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person("abc", 23);

        Person p1 = new Person("aaa", 12);
        p1.setParent(person);
        Person p2 = new Person("bbb", 13);
        p2.setParent(person);
        Person p3 = new Person("ccc", 14);
        p3.setParent(person);


        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        person.setPersonList(list);

        File yamlFile = new File("d:/1.yaml");
        Yaml.dump(list, yamlFile);
    }
}
