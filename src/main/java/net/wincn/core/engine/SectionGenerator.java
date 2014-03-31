package net.wincn.core.engine;

import net.wincn.core.bean.Section;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gefangshuai on 2014-03-31-0031.
 */
public class SectionGenerator {
    private static SectionGenerator ourInstance = new SectionGenerator();

    private List<Section> Sections;

    public static SectionGenerator getInstance() {
        return ourInstance;
    }

    private SectionGenerator() {
    }

    /**
     * 出始化Section数据
     * @return
     */
    public void initSections() {
        Sections = new ArrayList<Section>();
    }

    /**
     * 获得最后一个Section
     * @return
     */
    public Section getSection() {
        Assert.notNull(Sections, "Sections is null, Please call initSections () method to initialize!");
        if (Sections.size() == 0) {
            Section Section = new Section();
            Sections.add(Section);
        }
        return Sections.get(Sections.size()-1);
    }

    /**
     * 获得一个新的Section并存放到集合队列中
     * @return
     */
    public Section getNewSection(){
        Section Section = new Section();
        Section.setId("section_"+Sections.size()+1);
        Sections.add(Section);
        return Section;
    }

    public List<Section> getSections(){
        Assert.notNull(Sections, "Sections is null, Please call initSections () method to initialize!");
        return Sections;
    }
}
