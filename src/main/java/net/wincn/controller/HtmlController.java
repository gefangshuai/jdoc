package net.wincn.controller;

import com.jfinal.core.Controller;

/**
 * Author: gefangshuai
 * Create: 2014-03-30 11:05
 */
public class HtmlController extends Controller{

    public void index(){
        renderJsp("/_doc/");
    }
}
