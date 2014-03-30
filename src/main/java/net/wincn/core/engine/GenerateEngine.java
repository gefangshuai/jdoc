package net.wincn.core.engine;

import net.wincn.core.utils.AppConfigUtils;
import net.wincn.core.utils.DocFileUtils;
import net.wincn.core.utils.VelocityUtils;
import org.apache.velocity.VelocityContext;

import java.io.IOException;

/**
 * 文件产生引擎
 * Author: gefangshuai
 * Create: 2014-03-29 18:16
 */
public class GenerateEngine {
    private static GenerateEngine instance;

    private GenerateEngine() {

    }

    public static synchronized GenerateEngine getInstance() {
        if (instance == null) {
            instance = new GenerateEngine();
        }
        return instance;
    }

    /**
     * 生成文件
     */
    public void generate(){
        try {
            DocFileUtils.copyResources();
            VelocityUtils.generatePost(getContext());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private VelocityContext getContext() {
        VelocityContext context = new VelocityContext();
        context.put("theme", AppConfigUtils.getTheme());
        context.put("site", AppConfigUtils.getSite());


        context.put("doc", AppConfigUtils.getDoc());
        context.put("menu", AppConfigUtils.getMenu());
        context.put("slider", AppConfigUtils.getSlider());
        return context;
    }
}
