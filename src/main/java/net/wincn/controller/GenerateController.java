package net.wincn.controller;

import com.jfinal.core.Controller;
import net.wincn.core.engine.GenerateEngine;

import java.io.IOException;

/**
 * 生成html的controller
 * Author: gefangshuai
 * Create: 2014-03-29 16:01
 */
public class GenerateController extends Controller {
    public void index() throws IOException {
        GenerateEngine.getInstance().generate();
        renderText("生成成功！");
    }
}
